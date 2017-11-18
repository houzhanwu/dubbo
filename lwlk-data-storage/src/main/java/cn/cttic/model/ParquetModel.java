package cn.cttic.model;

import org.apache.parquet.example.data.Group;
import org.apache.parquet.example.data.GroupFactory;
import org.apache.parquet.hadoop.ParquetWriter;

public class ParquetModel {
	private GroupFactory factory;
	private ParquetWriter<Group> writer;

	public GroupFactory getFactory() {
		return factory;
	}

	public void setFactory(GroupFactory factory) {
		this.factory = factory;
	}

	public ParquetWriter<Group> getWriter() {
		return writer;
	}

	public void setWriter(ParquetWriter<Group> writer) {
		this.writer = writer;
	}

}
