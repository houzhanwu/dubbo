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
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Logger;
import org.apache.parquet.column.ParquetProperties;
import org.apache.parquet.example.data.Group;
import org.apache.parquet.example.data.GroupFactory;
import org.apache.parquet.example.data.simple.SimpleGroupFactory;
import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.example.GroupWriteSupport;
import org.apache.parquet.schema.MessageType;
import org.apache.parquet.schema.MessageTypeParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.cttic.Application;
import cn.cttic.config.MetricConfig;
import cn.cttic.utils.PositionRule;

import com.codahale.metrics.MetricRegistry;

@Component
public class JoinHdfsThread extends Thread {
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public int[] accesscodeArr = { 110000, 220000, 210000, 150000, 140000,
			130000, 120000, 650000, 640000, 630000, 620000, 610000, 540000,
			530000, 520000, 510000, 500000, 460000, 450000, 440000, 430000,
			420000, 340000, 370000, 360000, 350000, 410000, 330000, 320000,
			310000, 230000 };
	@Autowired
	private MetricRegistry metrics;
	public static final String ENCODING = "GBK";
	private String schemaStr = "message Pair {\n "
			+ "required binary vehicleno (UTF8);\n "
			+ "required int32 platecolor;\n "
			+ "required int64 positiontime;\n "
			+ "required int32 accesscode;\n " + "required int32 city;\n "
			+ "required int32 curaccesscode;\n " + "required int32 trans;\n "
			+ "required int64 updatetime;\n " + "required int32 encrypt;\n "
			+ "required int32 lon;\n " + "required int32 lat;\n "
			+ "required int32 vec1;\n " + "required int32 vec2;\n "
			+ "required int32 vec3;\n " + "required int32 direction;\n "
			+ "required int32 altitude;\n " + "required int64 state;\n "
			+ "required int64 alarm;\n " + "required binary reserved (UTF8);\n"
			+ "required binary errorcode (UTF8);\n"
			+ "required int32 roadcode;\n}";
	static Logger logger = Logger.getLogger(JoinHdfsThread.class);

	@SuppressWarnings("deprecation")
	public void run() {
		PositionRule prule = new PositionRule();
		FileInputStream fis = null;
		GZIPInputStream is = null;
		ArchiveInputStream in = null;
		InputStreamReader inr = null;
		BufferedReader reader = null;
		String lineTxt = null;
		TarArchiveEntry entry = null;
		String[] linesplit = null;

		Group group = null;
		long ptime = 0l;
		long rtime = 0l;
		String rule2 = "";
		File file = null;
		int size = 0;
		int bufferSize = 1024;
		int num = 0;
		boolean vec3 = true;
		boolean lon = true;
		boolean lat = true;
		boolean direction = true;
		Configuration configuration = null;
		Path path = null;
		FileSystem fs = null;
		MessageType schema = null;
		GroupWriteSupport writeSupport = null;
		ParquetWriter<Group> writer = null;
		GroupFactory factory = null;
		String absolutePath = "";
		logger.info("线程JoinHdfsThread  开始写入-------------              ");

		size = Application.allPathResult.size();
		for (int i = 0; i < size; i++) {
			file = Application.allPathResult.get(i);
			logger.info("Application.start Application.start Application.start      "
					+ i);
			try {
				absolutePath = file.getAbsolutePath();
				configuration = new Configuration();
				path = new Path("/data/hbase" + absolutePath.substring(10, 41)
						+ ".parquet");
				fs = path.getFileSystem(configuration);
				if (fs.exists(path)) {
					fs.delete(path, true);
				}

				schema = MessageTypeParser.parseMessageType(schemaStr);
				factory = new SimpleGroupFactory(schema);
				writeSupport = new GroupWriteSupport();
				GroupWriteSupport.setSchema(schema, configuration);
				writer = new ParquetWriter<Group>(path, writeSupport,
						ParquetWriter.DEFAULT_COMPRESSION_CODEC_NAME,
						ParquetWriter.DEFAULT_BLOCK_SIZE,
						ParquetWriter.DEFAULT_PAGE_SIZE,
						ParquetWriter.DEFAULT_PAGE_SIZE, /* dictionary page size */
						ParquetWriter.DEFAULT_IS_DICTIONARY_ENABLED,
						ParquetWriter.DEFAULT_IS_VALIDATING_ENABLED,
						ParquetProperties.WriterVersion.PARQUET_2_0,
						configuration);

				fis = new FileInputStream(file);
				is = new GZIPInputStream(new BufferedInputStream(fis),
						bufferSize);
				in = new ArchiveStreamFactory().createArchiveInputStream("tar",
						is);
				inr = new InputStreamReader(is, ENCODING);
				reader = new BufferedReader(inr);
				entry = (TarArchiveEntry) in.getNextEntry();

				while ((lineTxt = reader.readLine()) != null) {
					metrics.meter(MetricConfig.METRICS_INTO_HDFS).mark();
					num++;
					linesplit = lineTxt.split(",");
					if (linesplit != null && linesplit.length >= 18) {
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
							group = factory
									.newGroup()
									.append("vehicleno", linesplit[0])
									.append("platecolor",
											Integer.parseInt(linesplit[1]))
									.append("positiontime", ptime / 1000l)
									.append("accesscode",
											Integer.parseInt(linesplit[2]))
									.append("city",
											Integer.parseInt(linesplit[4]))
									.append("curaccesscode",
											Integer.parseInt(linesplit[6]))
									.append("trans",
											Integer.parseInt(linesplit[3]))
									.append("updatetime", rtime / 1000l)
									.append("encrypt", 0)
									.append("lon",
											Integer.parseInt(linesplit[9]))
									.append("lat",
											Integer.parseInt(linesplit[10]))
									.append("vec1",
											Integer.parseInt(linesplit[11]))
									.append("vec2",
											Integer.parseInt(linesplit[12]))
									.append("vec3",
											Integer.parseInt(linesplit[13]))
									.append("direction",
											Integer.parseInt(linesplit[14]))
									.append("altitude",
											Integer.parseInt(linesplit[15]))
									.append("state",
											Long.parseLong(linesplit[16]))
									.append("alarm",
											Long.parseLong(linesplit[17]))
									.append("reserved", "")
									.append("errorcode", rule2)
									.append("roadcode", 0);

							try {
								writer.write(group);
							} catch (IOException e) {

								e.printStackTrace();
							}
							if (num % 650000 == 0) {
								logger.info(lineTxt);
							}
						}
					}

				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ArchiveException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			} finally {
				close(fis);
				close(is);
				close(in);
				close(inr);
				close(reader);
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		logger.info("线程JoinHdfsThread   --结束写入-------------");
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

	public static void main(String[] args) {
		String str = "/home/data/fp/20170624_txt/data_22/640000.data.tar.gz";
		System.out.println(str.substring(10, 41));
	}
}
