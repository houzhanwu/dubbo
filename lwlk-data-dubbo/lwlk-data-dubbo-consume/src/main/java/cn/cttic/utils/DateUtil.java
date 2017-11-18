package cn.cttic.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String ifToday(String time) {
		SimpleDateFormat format = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		if (time == null || "".equals(time)) {
			return "";
		}
		Date date = null;
		try {
			date = format.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar current = Calendar.getInstance();

		Calendar today = Calendar.getInstance(); // 今天

		today.set(Calendar.YEAR, current.get(Calendar.YEAR));
		today.set(Calendar.MONTH, current.get(Calendar.MONTH));
		today.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH));
		// Calendar.HOUR——12小时制的小时数 Calendar.HOUR_OF_DAY——24小时制的小时数
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);

		Calendar yesterday = Calendar.getInstance(); // 昨天

		yesterday.set(Calendar.YEAR, current.get(Calendar.YEAR));
		yesterday.set(Calendar.MONTH, current.get(Calendar.MONTH));
		yesterday.set(Calendar.DAY_OF_MONTH,
				current.get(Calendar.DAY_OF_MONTH) - 1);
		yesterday.set(Calendar.HOUR_OF_DAY, 0);
		yesterday.set(Calendar.MINUTE, 0);
		yesterday.set(Calendar.SECOND, 0);

		current.setTime(date);

		if (current.after(today)) {
			return "今天";
		} else {
			return "不是今天";
		}
	}

	/**
	 * 设置结束时间 准备递减
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @return
	 */
	public static Calendar setDate(int year, int month, int day, int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);// 从0开始，0表是1月，1表示2月依次类推
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		/* HOUR_OF_DAY 指示一天中的小时 */
		calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY));
		return calendar;

	}

	/**
	 * 递减小时
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @return
	 */
	public static Calendar getHour(Calendar calendar) {
		/* HOUR_OF_DAY 指示一天中的小时 */
		calendar.set(Calendar.HOUR_OF_DAY,
				calendar.get(Calendar.HOUR_OF_DAY) - 1);
		return calendar;

	}

	/**
	 * 获取当前时间的前一个小时
	 */
	public static int getOneHoursAgoTime(int year, int month, int day, int hour) {
		Calendar calendar = Calendar.getInstance();
		/* HOUR_OF_DAY 指示一天中的小时 */
		calendar.set(Calendar.HOUR_OF_DAY,
				calendar.get(Calendar.HOUR_OF_DAY) - 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHH");
		// 获取到完整的时间
		return Integer.parseInt(df.format(calendar.getTime()).toString());
	}

	public static int oneDay(String time, String time2) {
		SimpleDateFormat format = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		int parseInt = 0;
		try {
			Date parse = format.parse(time);
			Date parse2 = format.parse(time2);
			long start = parse.getTime();
			long end = parse2.getTime();
			long space = (end / 1000) - (start / 1000);
			long value = space / 3600;
			parseInt = Integer.parseInt(value + "");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return parseInt;
	}

	public static void main(String[] args) {
		// Calendar cal = Calendar.getInstance();
		// cal.setTimeInMillis(1495984918000l);
		// Date time = cal.getTime();
		// SimpleDateFormat format = new java.text.SimpleDateFormat(
		// "yyyy-MM-dd HH:mm:ss");
		// System.out.println(format.format(time));
		// int oneDay = oneDay("2017-06-01 07:25:33", "2017-06-01 22:25:33");
		// System.out.println(oneDay);
		// DateUtil.
		Calendar setDate = setDate(2017, 7, 19, 15);
		System.out.println(setDate.getTime());
	}

	public static boolean ifSameDate(String startDate, String endDate)
			throws ParseException {

		SimpleDateFormat format = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new java.text.SimpleDateFormat("dd");
		Date parse = format.parse(startDate);
		Date parse2 = format.parse(endDate);
		String sta = format2.format(parse);
		String end = format2.format(parse2);
		if (sta.equals(end)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 获取当前日期 yyyy-MM-dd
	 */
	public static String getNowDay() {
		Date ddd = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateNowStr = sdf.format(ddd);
		return dateNowStr;
	}

	/**
	 * 日期格式的计算 相隔天数
	 */
	public static int daysBetween(String smdate, String bdate)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

}
