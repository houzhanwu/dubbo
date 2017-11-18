package com.csht.lwlkdatasubscribe.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZmqConfig {
	@Value("${publisher.tcp.hostName}")
	private String pubhostName;

	@Value("${publisher.tcp.port}")
	private String pubport;

	@Value("${subscrber.tcp.hostName}")
	private String subhostName;

	@Value("${subscrber.tcp.port}")
	private String subport;

	public String getPubhostName() {
		return pubhostName;
	}

	public void setPubhostName(String pubhostName) {
		this.pubhostName = pubhostName;
	}

	public String getPubport() {
		return pubport;
	}

	public void setPubport(String pubport) {
		this.pubport = pubport;
	}

	public String getSubhostName() {
		return subhostName;
	}

	public void setSubhostName(String subhostName) {
		this.subhostName = subhostName;
	}

	public String getSubport() {
		return subport;
	}

	public void setSubport(String subport) {
		this.subport = subport;
	}

}
