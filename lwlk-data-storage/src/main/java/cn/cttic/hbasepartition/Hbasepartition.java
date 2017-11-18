package cn.cttic.hbasepartition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 预分区建表
 * 
 * @author Administrator
 *
 */
public class Hbasepartition extends Thread {
	private final static Logger log = LoggerFactory.getLogger(Hbasepartition.class);
	public static int AC_VIN_CODE[] = { 194179, 189242, 188189, 189250, 187166, 203213, 213227, 190169, 212165, 205238,
			195246, 184211, 195201, 193201, 188170, 186218, 185240, 199237, 211229, 180168, 185243, 212198, 178216,
			201194, 184202, 199224, 196254, 208194, 182245, 207230, 212193 };
	public static Integer AC_VIN_CODE_RESULT[] = new Integer[62];
	public static List<Integer> list = new ArrayList<Integer>();
	public static String AC_VIN_CODE_STR[] = { "鲁", "津", "冀", "晋", "泸", "苏", "浙", "京", "豫", "皖", "闽", "赣", "蒙", "辽",
			"吉", "黑", "桂", "琼", "渝", "川", "贵", "云", "藏", "陕", "甘", "青", "宁", "新", "鄂", "湘", "粤" };
	public static String table;
	public static Configuration conf;
	public static List<String> columnFamily = new ArrayList<String>();
	public static String keySet[] = { "vehicleno", "platecolor", "positiontime", "accesscode", "trans" };

	public Hbasepartition() {
		System.setProperty("hadoop.home.dir", "F:\\bigdata\\hadoop\\bin ");
		conf = HBaseConfiguration.create();
		columnFamily.add("d");
	}

	/**
	 * 设置分区边界值
	 * 
	 * @return rowkey的边界值 车牌首字(共31个) midKey
	 */
	private static byte[][] getSplitKeys() {
		byte[][] splitKeys = new byte[AC_VIN_CODE.length][];
		TreeSet<byte[]> rows = new TreeSet<byte[]>(Bytes.BYTES_COMPARATOR);// 升序排序
		for (int i = 0; i < AC_VIN_CODE.length; i++) {
			rows.add(Bytes.toBytes(AC_VIN_CODE[i]));
		}

		Iterator<byte[]> rowKeyIter = rows.iterator();
		int i = 0;
		while (rowKeyIter.hasNext()) {
			byte[] tempRow = rowKeyIter.next();
			rowKeyIter.remove();
			splitKeys[i] = tempRow;
			i++;
		}
		return splitKeys;
	}

	/**
	 * 创建预分区hbase表
	 * 
	 * @param tableName
	 *            表名
	 * @param columnFamily
	 *            列簇
	 * @return
	 */
	@SuppressWarnings({ "resource", "deprecation" })
	public static boolean createTableBySplitKeys(String tableName, List<String> columnFamily) {
		try {
			if (StringUtils.isBlank(tableName) || columnFamily == null || columnFamily.size() < 0) {
				// 参数表| ColumnFamily不能为空，请检查
				log.error("===Parameters tableName|columnFamily should not be null,Please check!===");
			}
			HBaseAdmin admin = new HBaseAdmin(conf);
			if (admin.tableExists(tableName)) {
				// 如果表已存在，跳过
				log.info("Table already exists！(表已存在)");
				return true;
			} else {
				// 表不存在，就创建表
				HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf(tableName));
				for (String cf : columnFamily) {
					// 循环创建列簇
					tableDescriptor.addFamily(new HColumnDescriptor(cf));
				}
				// 获取分区的key
				byte[][] splitKeys = getSplitKeys();
				// 指定splitkeys
				admin.createTable(tableDescriptor, splitKeys);
				log.info("===Create Table " + tableName + " Success!columnFamily:" + columnFamily.toString() + "===");
				log.info("Create Table Success！(创建表成功)");
			}
		} catch (MasterNotRunningException e) {
			log.error(e.getMessage());
			return false;
		} catch (ZooKeeperConnectionException e) {
			log.error(e.getMessage());
			return false;
		} catch (IOException e) {
			log.error(e.getMessage());
			return false;
		}
		return true;
	}

	private String getRandomNumber() {
		String ranStr = Math.random() + "";
		int pointIndex = ranStr.indexOf(".");
		return ranStr.substring(pointIndex + 1, pointIndex + 3);
	}

	// 批量入库
	@SuppressWarnings("deprecation")
	private List<Put> batchPut() {
		System.out.println("开始时间：" + System.currentTimeMillis() / 1000);
		List<Put> list = new ArrayList<Put>();
		for (int i = 1; i <= 1000; i++) {
			byte[] rowkey = Bytes.toBytes(getRandomNumber() + "-" + System.currentTimeMillis() + "-" + i);
			Put put = new Put(rowkey);
			// 列族 、列名、值
			for (int j = 0; j < keySet.length; j++) {
				put.add(Bytes.toBytes("d"), Bytes.toBytes(keySet[j]), Bytes.toBytes("zs" + j));
			}
			list.add(put);
		}
		log.info("当前时间为：" + System.currentTimeMillis() / 1000);
		log.info("集合总数：" + list.size());
		return list;
	}

	@SuppressWarnings({ "deprecation", "resource" })
	public void run() {
		boolean create = createTableBySplitKeys("testhbase", columnFamily);
		if (create) {
			log.info("into create if！(表已经创建成功)");
			try {
				HBaseAdmin admin = new HBaseAdmin(conf);
				log.info("表是否有效：" + admin.isTableEnabled("testhbase"));
				HColumnDescriptor col = new HColumnDescriptor("testhbase");
				log.info("表列族：" + col.getName());
				HTable table = new HTable(conf, "testhbase");
				HColumnDescriptor[] columnFamilies = table.getTableDescriptor() // 获取所有的列族
						.getColumnFamilies();
				System.out.println("表中所有的列族长度：" + columnFamilies.length);

				for (int i = 0; i < columnFamilies.length; i++) {
					String familyName = columnFamilies[i].getNameAsString(); // 获取列族名
					System.out.println("获取列族名称：" + familyName);
				}

				table.setAutoFlushTo(false);
				table.put(batchPut());
				table.flushCommits();
				log.info("入库成功");

				// 删除表
				// deleteTable("testhbase");

				// 遍历查询hbase表
				// getResultScann("testhbase");
				// 关闭链接
				admin.close();
				log.info("admin.close()");
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}

	}

	/*
	 * 删除表
	 * 
	 * @tableName 表名
	 */
	@SuppressWarnings({ "deprecation", "resource" })
	public static void deleteTable(String tableName) throws IOException {
		HBaseAdmin admin = new HBaseAdmin(conf);
		admin.disableTable(tableName);
		admin.deleteTable(tableName);
		log.info(tableName + "is deleted!" + tableName + "表已删除");
	}

	/*
	 * 遍历查询hbase表
	 * 
	 * @tableName 表名
	 */
	@SuppressWarnings({ "deprecation", "resource" })
	public static void getResultScann(String tableName) throws IOException {
		Scan scan = new Scan();
		ResultScanner rs = null;
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		try {
			rs = table.getScanner(scan);
			for (org.apache.hadoop.hbase.client.Result r : rs) {
				for (org.apache.hadoop.hbase.KeyValue kv : r.list()) {
					System.out.println("row:" + Bytes.toString(kv.getRow()));
					System.out.println("family:" + Bytes.toString(kv.getFamily()));
					System.out.println("qualifier:" + Bytes.toString(kv.getQualifier()));
					System.out.println("value:" + Bytes.toString(kv.getValue()));
					System.out.println("timestamp:" + kv.getTimestamp());
					System.out.println("-------------------------------------------");
				}
			}
		} finally {
			rs.close();
		}
	}

	/*
	 * 查询表中的某一列
	 * 
	 * @tableName 表名
	 * 
	 * @rowKey rowKey
	 */
	@SuppressWarnings({ "deprecation", "resource" })
	public static void getResultByColumn(String tableName, String rowKey, String familyName, String columnName)
			throws IOException {
		HTable table = new HTable(conf, Bytes.toBytes(tableName));
		Get get = new Get(Bytes.toBytes(rowKey));
		get.addColumn(Bytes.toBytes(familyName), Bytes.toBytes(columnName)); // 获取指定列族和列修饰符对应的列
		Result result = table.get(get);
		for (org.apache.hadoop.hbase.KeyValue kv : result.list()) {
			System.out.println("family:" + Bytes.toString(((org.apache.hadoop.hbase.KeyValue) kv).getFamily()));
			System.out.println("qualifier:" + Bytes.toString(((org.apache.hadoop.hbase.KeyValue) kv).getQualifier()));
			System.out.println("value:" + Bytes.toString(((org.apache.hadoop.hbase.KeyValue) kv).getValue()));
			System.out.println("Timestamp:" + ((org.apache.hadoop.hbase.KeyValue) kv).getTimestamp());
			System.out.println("-------------------------------------------");
		}
	}

	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws Exception {
		boolean create = createTableBySplitKeys("testhbase", columnFamily);
		if (create) {
			log.info("into create if！(表已经创建成功)");
			HBaseAdmin admin = new HBaseAdmin(conf);
			log.info("表是否有效：" + admin.isTableEnabled("testhbase"));
			HColumnDescriptor col = new HColumnDescriptor("testhbase");
			log.info("表列族：" + col.getName());
		}
	}
}
