package com.csht.lwlkdatasubscribe.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import com.codahale.metrics.MetricRegistry;
import com.csht.lwlkdatasubscribe.modle.Vehicle;
import com.csht.lwlkdatasubscribe.thread.ZmqPub;
import com.csht.lwlkdatasubscribe.utils.CTTICZMQSUB;
import com.csht.lwlkdatasubscribe.utils.PartitionUtil;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * Hypt+lwlk
 * 
 * @author houzw
 * @ClassName : Listener
 * @Version 版本
 * @ModifiedBy 修改人
 * @Copyright 公司名称
 * @date 2017年6月16日 下午3:14:05
 */
@Component
public class DataListener {
	static Logger logger = Logger.getLogger(DataListener.class);

	@Autowired
	private MetricRegistry metrics;

	@KafkaListener(group = "POSITION_lwlk_000000", topicPartitions = {
			@TopicPartition(topic = "HYPT_POSITION", partitions = { "1", "2",
					"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
					"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
					"24", "25", "26", "27", "28", "29", "30", "31" }),
			@TopicPartition(topic = "LWLK_POSITION", partitions = { "1", "2",
					"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
					"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
					"24", "25", "26", "27", "28", "29", "30", "31" }) })
	public void listen(ConsumerRecord<String, byte[]> record)
			throws InvalidProtocolBufferException, Exception {
		byte[] value = record.value();
		try {
			CTTICZMQSUB.VehiclePosition vehiclePosition = CTTICZMQSUB.VehiclePosition
					.parseFrom(value);
			if (vehiclePosition.getAccessCode() == PartitionUtil.PARTITIONMAP
					.get(record.partition())) {
				Vehicle v = new Vehicle();
				v.setVehicleno(vehiclePosition.getVehicleNo());
				v.setPlatecolor(vehiclePosition.getPlateColor());
				// System.out.println(vehiclePosition.getVehicleNo());
				ZmqPub.zmqPubQueue.put(v);
				metrics.meter(
						com.csht.lwlkdatasubscribe.config.MetricConfig.METRICS_KAFKA_LWLKANDHYPT_METER)
						.mark();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
