package cn.cttic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import cn.cttic.thread.JoinHbaseThread;
import cn.cttic.thread.JoinHdfsThread;

@Component
public class Listener implements ApplicationListener<ApplicationReadyEvent> {
	private final static Logger LOG = LoggerFactory.getLogger(Listener.class);

	@Autowired
	private JoinHbaseThread joinHbaseThread;
	@Autowired
	private JoinHdfsThread joinHdfsThread;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {

		joinHbaseThread.start();
		LOG.info("---------------JoinHbaseThread start--------------");
		joinHdfsThread.start();
		LOG.info("---------------joinHdfsThread start--------------");

	}

}