package cn.cttic.utils;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Before;
import org.junit.Test;

public class DataUtil {
	private Configuration conf = null;

	@Before
	public void init() {
		conf = HBaseConfiguration.create();
		// conf.set("hbase.zookeeper.quorum", "kafka3,kafka2,kafka1");
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

}
