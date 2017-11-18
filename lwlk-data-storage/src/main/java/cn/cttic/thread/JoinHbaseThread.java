package cn.cttic.thread;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

import javax.annotation.PostConstruct;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.BufferedMutator;
import org.apache.hadoop.hbase.client.BufferedMutatorParams;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.RetriesExhaustedWithDetailsException;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.cttic.Application;
import cn.cttic.config.MetricConfig;
import cn.cttic.utils.DataUtil;
import cn.cttic.utils.PositionRule;

import com.codahale.metrics.MetricRegistry;

@Component
public class JoinHbaseThread extends Thread {
	static Logger logger = Logger.getLogger(JoinHbaseThread.class);
	public List<Put> puts_data = new ArrayList<Put>();
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static final String ENCODING = "GBK";
	public static final int BUFFERSIZE = 1024;
	private StringBuffer s;
	private StringBuffer sb;
	private Configuration conf = null;
	@Autowired
	private MetricRegistry metrics;

	@PostConstruct
	public void initHBase() {
		conf = HBaseConfiguration.create();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run() {

		BufferedMutator.ExceptionListener listener = new BufferedMutator.ExceptionListener() {
			@Override
			public void onException(RetriesExhaustedWithDetailsException e,
					BufferedMutator mutator) {
				for (int i = 0; i < e.getNumExceptions(); i++) {
					System.out.println("Failed to sent put " + e.getRow(i)
							+ ".");
					logger.error("Failed to sent put " + e.getRow(i) + ".");
				}
			}
		};
		Connection createConnection = null;
		BufferedMutator mutator = null;
		BufferedMutatorParams params = new BufferedMutatorParams(
				TableName.valueOf("cttic_posotion_cor")).listener(listener);
		params.writeBufferSize(20 * 1024 * 1024);
		try {
			createConnection = ConnectionFactory.createConnection(conf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			mutator = createConnection.getBufferedMutator(params);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		FileInputStream fis = null;
		GZIPInputStream is = null;
		ArchiveInputStream in = null;
		InputStreamReader inr = null;
		BufferedReader reader = null;
		PositionRule prule = new PositionRule();
		String lineTxt = null;
		TarArchiveEntry entry = null;
		String[] linesplit = null;
		File file = null;
		int size = 0;

		long ptime = 0l;
		long rtime = 0l;
		String rule2 = "";
		boolean vec3 = true;
		boolean lon = true;
		boolean lat = true;
		boolean direction = true;
		logger.info("JoinHbaseThread  线程开始执行----------------");
		size = Application.allPathResult.size();
		for (int i = 0; i < size; i++) {
			file = Application.allPathResult.get(i);
			try {
				fis = new FileInputStream(file);
				is = new GZIPInputStream(new BufferedInputStream(fis),
						BUFFERSIZE);
				in = new ArchiveStreamFactory().createArchiveInputStream("tar",
						is);
				inr = new InputStreamReader(is, ENCODING);
				reader = new BufferedReader(inr);
				entry = (TarArchiveEntry) in.getNextEntry();

				while ((lineTxt = reader.readLine()) != null) {
					metrics.meter(MetricConfig.METRICS_INTO_HBASE).mark();
					linesplit = lineTxt.split(",");
					if (linesplit != null && linesplit.length >= 18
							&& checkVin(linesplit[0])) {
						// System.out.println(lineTxt);
						try {
							Integer.parseInt(linesplit[13]);
							vec3 = true;
						} catch (Exception e) {
							vec3 = false;
						}
						try {
							Integer.parseInt(linesplit[9]);
							lon = true;
						} catch (Exception e) {
							lon = false;
						}
						try {
							Integer.parseInt(linesplit[10]);
							lat = true;
						} catch (Exception e) {
							lat = false;
						}
						try {
							Integer.parseInt(linesplit[14]);
							direction = true;
						} catch (Exception e) {
							direction = false;
						}

						// System.out.println(s.toString());

						if (vec3 && lon && lat && direction) {
							ptime = df.parse(linesplit[7]).getTime();
							rtime = df.parse(linesplit[8]).getTime();
							rule2 = prule.getRule(linesplit[0],
									Integer.parseInt(linesplit[2]),
									Integer.parseInt(linesplit[1]),
									Integer.parseInt(linesplit[9]),
									Integer.parseInt(linesplit[10]),
									Integer.parseInt(linesplit[15]),
									Integer.parseInt(linesplit[11]),
									Integer.parseInt(linesplit[14]),
									linesplit[7], rtime / 1000l);
							sb = new StringBuffer();
							sb.append(linesplit[0]).append("_")
									.append(linesplit[1]).append("_")
									.append(ptime / 1000l).append("_")
									.append(linesplit[2]).append("_")
									.append(linesplit[4]).append("_")
									.append(linesplit[6]).append("_")
									.append(linesplit[3]).append("_")
									.append(rtime / 1000l).append("_")
									.append(0).append("_").append(linesplit[9])
									.append("_").append(linesplit[10])
									.append("_").append(linesplit[11])
									.append("_").append(linesplit[12])
									.append("_").append(linesplit[13])
									.append("_").append(linesplit[14])
									.append("_").append(linesplit[15])
									.append("_").append(linesplit[16])
									.append("_").append(linesplit[17])
									.append("_").append("").append("_")
									.append(rule2).append("_").append(0);
							// System.out.println(getRowKey(linesplit[0],
							// linesplit[1], ptime / 1000l));
							// System.out.println(sb.toString());
							byte[] rowkey = Bytes.toBytes(getRowKey(
									linesplit[0], linesplit[1], ptime / 1000l));
							Put put = new Put(rowkey);
							put.setWriteToWAL(false);
							put.add(Bytes.toBytes("d"), Bytes.toBytes("info"),
									Bytes.toBytes(sb.toString()));
							puts_data.add(put);
							if (puts_data.size() == 5000) {
								try {
									mutator.mutate(puts_data);
								} catch (IOException e1) {
									e1.printStackTrace();
								}
								try {
									mutator.flush();
								} catch (IOException e1) {
									e1.printStackTrace();
								}
								puts_data.clear();
							}
						}

					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ArchiveException e) {
				e.printStackTrace();
			} catch (ParseException e1) {
				e1.printStackTrace();
			} finally {
				close(fis);
				close(is);
				close(in);
				close(inr);
				close(reader);
			}
		}
	}

	// for (int i = 0; i < DataUtil.AC_VIN_CODE_STR.length; i++) {
	// Integer integer = DataUtil.AC_VIN_CODE_MAP
	// .get(DataUtil.AC_VIN_CODE_STR[i]);
	// for (int j = 0; j <= 99999; j++) {
	// num++;
	// metrics.meter(MetricConfig.METRICS_INTO_HBASE).mark();
	// str = String.format("%05d", j);
	// s = new StringBuffer();
	//
	// s.append(integer).append("A").append(str).append("_")
	// .append("2").append("_")
	// .append(new Date().getTime() / 1000);
	// // System.out.println(s.toString());
	// byte[] rowkey = Bytes.toBytes(s.toString());
	// Put put = new Put(rowkey);
	// put.setWriteToWAL(false);
	// put.add(Bytes.toBytes("d"), Bytes.toBytes("info"),
	// Bytes.toBytes(DataUtil.VALUE_STR));
	// puts_data.add(put);
	// if (puts_data.size() == 5000) {
	// try {
	// mutator.mutate(puts_data);
	// } catch (IOException e1) {
	// e1.printStackTrace();
	// }
	// try {
	// mutator.flush();
	// } catch (IOException e1) {
	// e1.printStackTrace();
	// }
	// puts_data.clear();
	// }
	//
	// }
	// }

	private String getRowKey(String vin, String color, long positiontime) {
		s = new StringBuffer();
		if (vin != null && !vin.equals("") && vin.length() > 1) {
			s.append(
					DataUtil.AC_VIN_CODE_MAP.get(String.valueOf(vin.charAt(0))))
					.append(vin.substring(1, vin.length())).append("_")
					.append(color).append("_").append(positiontime);
		}
		return s.toString();
	}

	private static void close(Closeable closable) {
		if (closable != null) {
			try {
				closable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean checkVin(String vin) {
		if ((vin.length() < 6) || (vin.length() > 10)) {
			return false;
		}
		Pattern p = Pattern.compile("^[A-Z]+[A-Z0-9]+[A-Z0-9挂学]$");
		Matcher m = p.matcher(vin.substring(1).toUpperCase());
		if (!m.matches()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		JoinHbaseThread jj = new JoinHbaseThread();
		System.out.println(jj.getRowKey("冀JQ2351", "2", 1943885576));
	}

}
