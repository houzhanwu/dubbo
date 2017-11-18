package cn.cttic.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

public class HBaseUtil {
	private static Configuration conf;
	private static Connection conn;
	static{
		conf = HBaseConfiguration.create();//配置文件对象
		try {
			conn = ConnectionFactory.createConnection(conf);//连接对象
			System.out.println("创建连接");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		if(conn == null || conn.isClosed()){
			try {
				conn = ConnectionFactory.createConnection(conf);
				System.out.println("HBase数据库连接创建好了！");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void close(){
		if(conn != null){
			try {
				conn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	public static Map<String,String> byGet(String tableName,String startRow,String endRow,String family){
		Map<String,String> result = new HashMap<String,String>();
		try{
			Table t = getConn().getTable(TableName.valueOf(tableName));
		//	Scan scan = new Scan(startRow.getBytes(),endRow.getBytes());//扫描
			Scan scan = new Scan();
			scan.addFamily(family.getBytes());//指定特定的列族
			ResultScanner rs = t.getScanner(scan);//扫描结果
			for(Result r:rs){
				for(Cell cell:r.rawCells()){
				//	result.put(Bytes.toString(CellUtil.cloneQualifier(cell)), Bytes.toString(CellUtil.cloneValue(cell)));
					result.put(new String(r.getRow()), Bytes.toString(CellUtil.cloneValue(cell)));
					System.out.println("行健："+new String(r.getRow())
					+"\nvalue:"+Bytes.toString(CellUtil.cloneValue(cell)));
				}	
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println(
					"startRow:"+startRow+
					"endRow:"+endRow+
					"map的大小："+result.size());
		//	close();
		}
		return result;
	} 
 
}
