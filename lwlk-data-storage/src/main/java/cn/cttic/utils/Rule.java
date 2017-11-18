package cn.cttic.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rule {
	static Logger logger = LoggerFactory.getLogger(Rule.class);
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static SimpleDateFormat hdf = new SimpleDateFormat("yyyyMMdd");
	private String error;
	private static Set<String> PROV_CN = new HashSet<String>();
	private static HashMap<String, Object> PROVINCE = new HashMap<String, Object>();
	public static Set<String> ACODESET = new HashSet<String>();

	static {
		PROVINCE.put("110000", "京");
		PROVINCE.put("220000", "吉");
		PROVINCE.put("210000", "辽");
		PROVINCE.put("150000", "蒙");
		PROVINCE.put("140000", "晋");
		PROVINCE.put("130000", "冀");
		PROVINCE.put("120000", "津");
		PROVINCE.put("650000", "新");
		PROVINCE.put("640000", "宁");
		PROVINCE.put("630000", "青");
		PROVINCE.put("620000", "甘");
		PROVINCE.put("610000", "陕");
		PROVINCE.put("540000", "藏");
		PROVINCE.put("530000", "云");
		PROVINCE.put("520000", "贵");
		PROVINCE.put("510000", "川");
		PROVINCE.put("500000", "渝");
		PROVINCE.put("460000", "琼");
		PROVINCE.put("450000", "桂");
		PROVINCE.put("440000", "粤");
		PROVINCE.put("430000", "湘");
		PROVINCE.put("420000", "鄂");
		PROVINCE.put("340000", "皖");
		PROVINCE.put("370000", "鲁");
		PROVINCE.put("360000", "赣");
		PROVINCE.put("350000", "闽");
		PROVINCE.put("410000", "豫");
		PROVINCE.put("330000", "浙");
		PROVINCE.put("320000", "苏");
		PROVINCE.put("310000", "沪");
		PROVINCE.put("230000", "黑");

		PROV_CN.add("京");
		PROV_CN.add("吉");
		PROV_CN.add("辽");
		PROV_CN.add("蒙");
		PROV_CN.add("晋");
		PROV_CN.add("冀");
		PROV_CN.add("津");
		PROV_CN.add("新");
		PROV_CN.add("宁");
		PROV_CN.add("青");
		PROV_CN.add("甘");
		PROV_CN.add("陕");
		PROV_CN.add("藏");
		PROV_CN.add("云");
		PROV_CN.add("贵");
		PROV_CN.add("川");
		PROV_CN.add("渝");
		PROV_CN.add("琼");
		PROV_CN.add("桂");
		PROV_CN.add("粤");
		PROV_CN.add("湘");
		PROV_CN.add("鄂");
		PROV_CN.add("皖");
		PROV_CN.add("鲁");
		PROV_CN.add("赣");
		PROV_CN.add("闽");
		PROV_CN.add("豫");
		PROV_CN.add("浙");
		PROV_CN.add("苏");
		PROV_CN.add("沪");
		PROV_CN.add("黑");

		ACODESET.add("京");
		ACODESET.add("吉");
		ACODESET.add("辽");
		ACODESET.add("蒙");
		ACODESET.add("晋");
		ACODESET.add("冀");
		ACODESET.add("津");
		ACODESET.add("新");
		ACODESET.add("宁");
		ACODESET.add("青");
		ACODESET.add("甘");
		ACODESET.add("陕");
		ACODESET.add("藏");
		ACODESET.add("云");
		ACODESET.add("贵");
		ACODESET.add("川");
		ACODESET.add("渝");
		ACODESET.add("琼");
		ACODESET.add("桂");
		ACODESET.add("粤");
		ACODESET.add("湘");
		ACODESET.add("鄂");
		ACODESET.add("皖");
		ACODESET.add("鲁");
		ACODESET.add("赣");
		ACODESET.add("闽");
		ACODESET.add("豫");
		ACODESET.add("浙");
		ACODESET.add("苏");
		ACODESET.add("沪");
		ACODESET.add("黑");
	}

	// 检查车牌号
	public boolean checkVin(String vin, String code) {
		if ((vin.length() < 6) || (vin.length() > 10)) {
			setError("1001");
			return false;
		}
		// if ((PROVINCE.get(code) == null) || (!vin.substring(0,
		// 1).equals(PROVINCE.get(code)))) {
		if (PROVINCE.get(code) == null
				|| vin.substring(0, 1) == null
				|| (!vin.substring(0, 1).equals(PROVINCE.get(code)) && !PROV_CN
						.contains(vin.substring(0, 1)))) {
			setError("1002");
			return false;
		}
		Pattern p = Pattern.compile("^[A-Z]+[A-Z0-9]+[A-Z0-9挂学]$");
		Matcher m = p.matcher(vin.substring(1).toUpperCase());
		if (!m.matches()) {
			setError("1003");
			return false;
		}
		return true;
	}

	// 验证车牌颜色
	public boolean checkColor(String color) {
		if (color.equals("1")) {
			return true;
		}
		if (color.equals("2")) {
			return true;
		}
		if (color.equals("3")) {
			return true;
		}
		if (color.equals("4")) {
			return true;
		}
		if (color.equals("8")) {
			return true;
		}
		if (color.equals("9")) {
			return true;
		}
		setError("1101");
		return false;
	}

	// 验证经纬度
	public boolean checkLonLat(String lon, String lat) {
		try {
			long l = Long.parseLong(lon);
			long t = Long.parseLong(lat);
			if ((l < 73330000L) || (l > 135050000L)) {
				setError("1202");
				return false;
			}
			if ((t < 3510000L) || (t > 53330000L)) {
				setError("1203");
				return false;
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			setError("1201");
			return false;
		}
		return true;
	}

	// 验证海拔
	public boolean checkAltitude(String altitude) {
		try {
			int el = Integer.parseInt(altitude);
			if ((el >= -200) && (el <= 6000)) {
				// if ((el >= 0) && (el <= 4500)) {
				return true;
			}
			setError("1302");
			return false;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			setError("1301");
		}
		return false;
	}

	// 验证速度
	public boolean checkSpeed(String speed) {
		try {
			int sp = Integer.parseInt(speed);
			if ((sp >= 0) && (sp <= 160)) {
				return true;
			}
			setError("1402");
			return false;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			setError("1401");
		}
		return false;
	}

	// 验证方向
	public boolean checkDirection(String direction) {
		try {
			int di = Integer.parseInt(direction);
			if ((di >= 0) && (di <= 360)) {
				return true;
			}
			setError("1502");
			return false;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			setError("1501");
		}
		return false;
	}

	// 验证时间
	public boolean checkTime(String positionTime, String receiveTime) {
		try {
			long ptime = df.parse(positionTime).getTime();
			long rtime = df.parse(receiveTime).getTime();
			if (rtime >= ptime || (rtime < ptime && ptime - rtime < 31000L)) {
				long now = new Date().getTime();
				if (now - ptime > 72000000L) {
					setError("1603");
					return false;
				}
				return true;
			}
			setError("1602");
			return false;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			setError("1601");
		}
		return false;
	}

	// 验证补报数据定位时间(当前时间不能超定位时间一周)
	public boolean checkRepayTime(String positionTime, String receiveTime) {
		try {
			long ptime = df.parse(positionTime).getTime();
			long rtime = df.parse(receiveTime).getTime();
			if (rtime >= ptime || (rtime < ptime && ptime - rtime < 31000L)) {
				long now = new Date().getTime();
				if (now - ptime > 518400000L) {
					setError("1603");
					return false;
				}
				return true;
			}
			setError("1602");
			return false;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			setError("1601");
		}
		return false;
	}

	// 验证时间
	public boolean checkTimeHistorical(String positionTime, String receiveTime,
			String ntime) {
		try {
			long ptime = df.parse(positionTime).getTime();
			long rtime = df.parse(receiveTime).getTime();
			if (rtime >= ptime || (rtime < ptime && ptime - rtime < 31000L)) {
				long now = hdf.parse(ntime).getTime() + 86400000;
				if (now - ptime > 72000000L) {
					setError("1603");
					return false;
				}
				return true;
			}
			setError("1602");
			return false;
		} catch (Exception e) {
			// logger.error(e.getMessage(), e);
			setError("1601");
		}
		return false;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public static void main(String[] args) {
		Rule r = new Rule();
		// 2016-04-24 10:01:56-----------20160424-----------2016-04-24 10:02:45

		System.out.println(r.checkTimeHistorical("2016-04-24 10:01:56",
				"2016-04-24 10:02:45", "20160424") + "," + r.getError());
	}
}
