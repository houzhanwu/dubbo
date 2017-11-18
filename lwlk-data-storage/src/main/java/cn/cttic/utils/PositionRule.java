package cn.cttic.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PositionRule {
	static Logger logger = LoggerFactory.getLogger(PositionRule.class);

	static SimpleDateFormat hdf = new SimpleDateFormat("yyyyMMdd");
	private static Set<String> PROV_CN = new HashSet<String>();
	private static HashMap<Integer, Object> PROVINCE = new HashMap<Integer, Object>();

	static {
		PROVINCE.put(110000, "京");
		PROVINCE.put(220000, "吉");
		PROVINCE.put(210000, "辽");
		PROVINCE.put(150000, "蒙");
		PROVINCE.put(140000, "晋");
		PROVINCE.put(130000, "冀");
		PROVINCE.put(120000, "津");
		PROVINCE.put(650000, "新");
		PROVINCE.put(640000, "宁");
		PROVINCE.put(630000, "青");
		PROVINCE.put(620000, "甘");
		PROVINCE.put(610000, "陕");
		PROVINCE.put(540000, "藏");
		PROVINCE.put(530000, "云");
		PROVINCE.put(520000, "贵");
		PROVINCE.put(510000, "川");
		PROVINCE.put(500000, "渝");
		PROVINCE.put(460000, "琼");
		PROVINCE.put(450000, "桂");
		PROVINCE.put(440000, "粤");
		PROVINCE.put(430000, "湘");
		PROVINCE.put(420000, "鄂");
		PROVINCE.put(340000, "皖");
		PROVINCE.put(370000, "鲁");
		PROVINCE.put(360000, "赣");
		PROVINCE.put(350000, "闽");
		PROVINCE.put(410000, "豫");
		PROVINCE.put(330000, "浙");
		PROVINCE.put(320000, "苏");
		PROVINCE.put(310000, "沪");
		PROVINCE.put(230000, "黑");

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
	}

	// 1001 车牌长度小于6或大于10
	// 1002 车牌第一位错误
	// 1003 车牌不符合规则
	// 1101 车牌颜色不是1,2,3,4,8,9
	// 1202 经度错误
	// 1203 纬度错误
	// 1302 海拔低于负200米或高于6000米
	// 1402 速度小于0或者大于160
	// 1502 方向小于0或者大于360
	// 1601 时间格式错误
	// 1602 接收时间早于定位时间

	// 上述规则验证
	public String getRule(String vin, int code, int color, int lon, int lat,
			int altitude, int speed, int direction, String positionTime,
			long receiveTime) {
		StringBuffer sb = new StringBuffer();
		/* 检查车牌号 */

		// 1001
		if ((vin.length() < 6) || (vin.length() > 10)) {
			sb.append("1");
		} else {
			sb.append("0");
		}

		if (vin.length() > 0) {
			// 1002
			if (PROVINCE.get(code) == null
					|| (!PROV_CN.contains(vin.substring(0, 1)))) {
				sb.append("1");
			} else {
				sb.append("0");
			}

			// 1003
			Pattern p = Pattern.compile("^[A-Z]+[A-Z0-9]+[A-Z0-9挂学$]");
			Matcher m = p.matcher(vin.substring(1).toUpperCase());
			if (!m.matches()) {
				sb.append("1");
			} else {
				sb.append("0");
			}
		} else {
			sb.append("0");
			sb.append("0");
		}

		/* 验证车牌颜色 */
		// 1101
		if ((color > 0 && color < 5) || color == 8 || color == 9) {
			sb.append("0");
		} else {
			sb.append("1");
		}
		/* 验证经纬度 */
		// 1202
		if ((lon < 73330000) || (lon > 135050000)) {
			sb.append("1");
		} else {
			sb.append("0");
		}
		// 1203
		if ((lat < 3510000) || (lat > 53330000)) {
			sb.append("1");
		} else {
			sb.append("0");
		}
		/* 海拔格式异常 */
		// 1301
		if (altitude > 6000) {
			sb.append("1");
		} else {
			sb.append("0");
		}
		/* 速度大于160 */
		// 1402
		if (speed > 160) {
			sb.append("1");
		} else {
			sb.append("0");
		}
		/* 方向小于0或者大于360 */
		// 1502
		if (direction > 360) {
			sb.append("1");
		} else {
			sb.append("0");
		}

		// 1601 时间格式错误

		long ptime = 0l;
		try {

			Pattern patternTime = Pattern
					.compile("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{1,2}:\\d{1,2}$");
			Matcher matcher = patternTime.matcher(positionTime);
			if (matcher.matches()) {
				SimpleDateFormat df = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss");
				ptime = df.parse(positionTime).getTime() / 1000;
				sb.append("0");
				// 1602 接收时间早于定位时间
				if (receiveTime >= ptime
						|| (receiveTime < ptime && ptime - receiveTime < 31000L)) {
					sb.append("0");
				} else {
					sb.append("1");
				}
			} else {
				sb.append("1");
				sb.append("1");
			}

		} catch (ParseException e) {
			sb.append("1");
			sb.append("1");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// Pattern p = Pattern.compile("^[A-Z]+[A-Z0-9]+[A-Z0-9挂学$]");
		// Matcher m = p.matcher("京B11934344451学".substring(1).toUpperCase());
		// System.out.println(m.matches());
		Pattern patternTime = Pattern
				.compile("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{1,2}:\\d{1,2}$");
		Matcher matcher = patternTime.matcher("2016-04-24  10:02:45");
		// 2016-04-24 10:01:56-----------20160424-----------2016-04-24 10:02:45

		System.out.println(matcher.matches());
	}
}
