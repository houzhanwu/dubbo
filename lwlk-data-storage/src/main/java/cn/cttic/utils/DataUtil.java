package cn.cttic.utils;

import static com.codahale.metrics.MetricRegistry.name;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.BufferedMutator;
import org.apache.hadoop.hbase.client.BufferedMutatorParams;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.RetriesExhaustedWithDetailsException;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

public class DataUtil {
	private Configuration conf = null;

	public static Map<String, Integer> AC_VIN_CODE_MAP = new HashMap<>();
	public static Map<String, String> VINMAP = new HashMap<>();
	/**
	 * 实例化一个registry，最核心的一个模块，相当于一个应用程序的metrics系统的容器，维护一个Map
	 */
	public static final MetricRegistry metrics = new MetricRegistry();

	/**
	 * 在控制台上打印输出
	 */
	public static ConsoleReporter reporter = ConsoleReporter.forRegistry(
			metrics).build();

	/**
	 * 实例化一个Meter
	 */
	public static final Meter requests = metrics.meter(name(DataUtil.class,
			"request"));

	public List<Put> puts_data = new ArrayList<Put>();
	public static String VALUE_STR = "渝D55175_2_1503286233000_500000_500110_653129_20_1503286235_0_77221046_39738466_6_6_341_1171_786627_0_null_13985";
	public static String AC_VIN_CODE_STR[] = { "鲁", "津", "冀", "晋", "泸", "苏",
			"浙", "京", "豫", "皖", "闽", "赣", "蒙", "辽", "吉", "黑", "桂", "琼", "渝",
			"川", "贵", "云", "藏", "陕", "甘", "青", "宁", "新", "鄂", "湘", "粤" };
	static Logger logger = Logger.getLogger(DataUtil.class);
	static {
		AC_VIN_CODE_MAP.put("鲁", 194179);
		AC_VIN_CODE_MAP.put("津", 189242);
		AC_VIN_CODE_MAP.put("冀", 188189);
		AC_VIN_CODE_MAP.put("晋", 189250);
		AC_VIN_CODE_MAP.put("泸", 187166);
		AC_VIN_CODE_MAP.put("苏", 203213);
		AC_VIN_CODE_MAP.put("浙", 213227);
		AC_VIN_CODE_MAP.put("京", 190169);
		AC_VIN_CODE_MAP.put("豫", 212165);
		AC_VIN_CODE_MAP.put("皖", 205238);
		AC_VIN_CODE_MAP.put("闽", 195246);
		AC_VIN_CODE_MAP.put("赣", 184211);
		AC_VIN_CODE_MAP.put("蒙", 195201);
		AC_VIN_CODE_MAP.put("辽", 193201);
		AC_VIN_CODE_MAP.put("吉", 188170);
		AC_VIN_CODE_MAP.put("黑", 186218);
		AC_VIN_CODE_MAP.put("桂", 185240);
		AC_VIN_CODE_MAP.put("琼", 199237);
		AC_VIN_CODE_MAP.put("渝", 211229);
		AC_VIN_CODE_MAP.put("川", 180168);
		AC_VIN_CODE_MAP.put("贵", 185243);
		AC_VIN_CODE_MAP.put("云", 212198);
		AC_VIN_CODE_MAP.put("藏", 178216);
		AC_VIN_CODE_MAP.put("陕", 201194);
		AC_VIN_CODE_MAP.put("甘", 184202);
		AC_VIN_CODE_MAP.put("青", 199224);
		AC_VIN_CODE_MAP.put("宁", 196254);
		AC_VIN_CODE_MAP.put("新", 208194);
		AC_VIN_CODE_MAP.put("鄂", 182245);
		AC_VIN_CODE_MAP.put("湘", 207230);
		AC_VIN_CODE_MAP.put("粤", 212193);

		VINMAP.put("110000", "京");
		VINMAP.put("120000", "津");
		VINMAP.put("130000", "冀");
		VINMAP.put("140000", "晋");
		VINMAP.put("150000", "蒙");
		VINMAP.put("210000", "辽");
		VINMAP.put("220000", "吉");
		VINMAP.put("230000", "黑");
		VINMAP.put("310000", "沪");
		VINMAP.put("320000", "苏");
		VINMAP.put("330000", "浙");
		VINMAP.put("340000", "皖");
		VINMAP.put("350000", "闽");
		VINMAP.put("360000", "赣");
		VINMAP.put("370000", "鲁");
		VINMAP.put("410000", "豫");
		VINMAP.put("420000", "鄂");
		VINMAP.put("430000", "湘");
		VINMAP.put("440000", "粤");
		VINMAP.put("450000", "桂");
		VINMAP.put("460000", "琼");
		VINMAP.put("500000", "渝");
		VINMAP.put("510000", "川");
		VINMAP.put("520000", "黔");
		VINMAP.put("530000", "滇");
		VINMAP.put("540000", "藏");
		VINMAP.put("610000", "陕");
		VINMAP.put("620000", "甘");
		VINMAP.put("630000", "青");
		VINMAP.put("640000", "宁");
		VINMAP.put("650000", "新");
	}

	public static void handleRequest() {
		// System.out.println("---");
		requests.mark();
	}

	public DataUtil() {
		conf = HBaseConfiguration.create();
	}

	@Before
	public void init() {
		conf = HBaseConfiguration.create();
		// conf.set("hbase.zookeeper.quorum", "kafka3,kafka2,kafka1");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testhbase() throws IOException {
		// HTable hTable = new HTable(conf, "cttic_posotion_cor");
		reporter.start(3, TimeUnit.SECONDS);
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

		BufferedMutatorParams params = new BufferedMutatorParams(
				TableName.valueOf("cttic_posotion_cor")).listener(listener);
		params.writeBufferSize(20 * 1024 * 1024);
		Connection createConnection = ConnectionFactory.createConnection(conf);

		BufferedMutator mutator = createConnection.getBufferedMutator(params);

		long start = System.currentTimeMillis();
		int num = 0;
		StringBuffer s = null;
		String str = "";
		while (true) {
			for (int i = 0; i < AC_VIN_CODE_STR.length; i++) {
				Integer integer = AC_VIN_CODE_MAP.get(AC_VIN_CODE_STR[i]);
				for (int j = 0; j <= 99999; j++) {
					num++;
					handleRequest();
					str = String.format("%05d", j);
					s = new StringBuffer();

					s.append(integer).append("A").append(str).append("_")
							.append("2").append("_")
							.append(new Date().getTime() / 1000);
					System.out.println(s.toString());
					// byte[] rowkey = Bytes.toBytes(s.toString());
					// Put put = new Put(rowkey);
					// put.setWriteToWAL(false);
					// put.add(Bytes.toBytes("d"), Bytes.toBytes("info"),
					// Bytes.toBytes(VALUE_STR));
					// puts_data.add(put);
					// if (puts_data.size() == 5000) {
					// mutator.mutate(puts_data);
					// mutator.flush();
					// puts_data.clear();
					// }

					// if (num % 100000 == 0) {
					// System.out.println(num + "---" + s.toString());
					// long end = System.currentTimeMillis();
					// System.out.println(end - start);
					// }
				}
			}
		}
	}

	@Test
	public void scanResult() {
		Scan scan = new Scan();
		try (Connection connection = ConnectionFactory.createConnection(conf);
				Table table = connection.getTable(TableName
						.valueOf("cttic_posotion_cor"));
				ResultScanner rs = table.getScanner(scan)) {
			for (Result r : rs) {
				for (Cell cell : r.listCells()) {
					System.out.println("Row:"
							+ Bytes.toString(cell.getRowArray(),
									cell.getRowOffset(), cell.getRowLength()));
					System.out.println("family:"
							+ Bytes.toString(cell.getFamilyArray(),
									cell.getFamilyOffset(),
									cell.getFamilyLength()));
					System.out.println("qualifier:"
							+ Bytes.toString(cell.getQualifierArray(),
									cell.getQualifierOffset(),
									cell.getQualifierLength()));
					System.out.println("value:"
							+ Bytes.toString(cell.getValueArray(),
									cell.getValueOffset(),
									cell.getValueLength()));
					System.out.println("Timestamp:" + cell.getTimestamp());
					System.out.println("------------------------------");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException,
			IOException {
		// DataUtil du = new DataUtil();
		// du.testhbase();
		String str = "UTF-8";
		String rowkey = "渝D55175_2_1503286233000_500000_500110_653129_20_1503286235_0_77221046_39738466_6_6_341_1171_786627_0_null_13985";
		System.out.println(rowkey.getBytes(str).length);
	}
}
