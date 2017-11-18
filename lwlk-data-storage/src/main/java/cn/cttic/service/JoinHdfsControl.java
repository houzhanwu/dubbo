//package cn.cttic.service;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import cn.cttic.thread.JoinHdfsThread02;
//
//@Component
//public class JoinHdfsControl {
//	public final static long SPACING_INTERVAL = 60 * 60 * 1000;
//	//public List<JoinHdfsThread02> list = new ArrayList<>();
//	static Logger logger = Logger.getLogger(JoinHdfsControl.class);
//
//	//@Scheduled(fixedDelay = SPACING_INTERVAL)
//	public void JoinHdfs() throws IOException {
//
//		logger.info("JoinHdfsControl  任务开始执行----------------");
//		logger.info("--------list.size()-------- : " + list.size());
//		logger.info("--------list.size()-------- : " + list.size());
//		logger.info("--------list.size()-------- : " + list.size());
//		logger.info("--------list.size()-------- : " + list.size());
//		logger.info("--------list.size()-------- : " + list.size());
//		logger.info("--------list.size()-------- : " + list.size());
//		if (list != null && list.size() > 0) {
//			JoinHdfsThread02 testThread = list.get(0);
//
//			while (testThread.getMark()) {
//				if (testThread.getMark()) {
//					testThread.changeIsskip();
//					break;
//				}
//
//			}
//
//			while (testThread.isAlive()) {
//
//				if (testThread.isAlive()) {
//					// System.out.println("huo de");
//
//				}
//			}
//			if (!testThread.isAlive()) {
//				logger.info("--------- si de ----------");
//				list.clear();
//				JoinHdfsThread02 tt = new JoinHdfsThread02();
//				tt.start();
//				list.add(tt);
//
//			}
//
//		} else {
//			JoinHdfsThread02 tt = new JoinHdfsThread02();
//			tt.start();
//			list.add(tt);
//		}
//
//	}
//
// }
