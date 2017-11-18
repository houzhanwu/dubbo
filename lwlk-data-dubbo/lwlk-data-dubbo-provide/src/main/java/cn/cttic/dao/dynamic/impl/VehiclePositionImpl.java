package cn.cttic.dao.dynamic.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;










import org.junit.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cn.cttic.dao.dynamic.VehiclePosition;
import cn.cttic.model.dynamic.Position;
import cn.cttic.utils.HBaseUtil;
import cn.cttic.utils.VehicleNoUtil;

@Component
//@Repository
public class VehiclePositionImpl implements VehiclePosition {
	
	private String tableName;

	private String rowkey;
	
	private String family;
	
	private StringBuffer startRow ;
	private StringBuffer endRow ;
	@Override
	public List<Position> queryVehiclePosition(HashMap<String, String> conditions) {
		startRow = new StringBuffer();
		endRow = new StringBuffer();
		List<Position> result = new ArrayList<Position>();//存放查询结果
		
		Iterator<String> it = conditions.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			String value = (String) conditions.get(key);
			if(key.equals("rowkey")){
				rowkey = value;		//三个查询条件放在行健中：车牌号码，车牌颜色，定位时间
			}
		}
		
		family = "d";//列族
		
		tableName = "cttic_posotion_cor";//表名
		
		Map<String, String> map = new HashMap<String, String>();//存放查询结果
		
		String[] condition = rowkey.split("_");
		startRow = startRow.append(VehicleNoUtil.getVehicleNo(condition[0].toString()).substring(0,11)).append("_")//将车牌号的汉字转换成数字
				.append(condition[1].toString()).append("_").
				append(condition[2].toString().substring(0,10));//定位时间截取10位数字
		endRow = endRow.append(VehicleNoUtil.getVehicleNo(condition[0].toString()).substring(0,11)).append("_").//将车牌号的汉字转换成数字
				append(condition[1].toString()).append("_").
				append(condition[3].toString().substring(0,10));//定位时间截取10位数字
		
		
		//调用HBaseUtil中的查询方法
		map = HBaseUtil.byGet(tableName, startRow.toString(), endRow.toString(), family);
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String) iter.next();
			String value = (String) map.get(key);
			
			
			String[] element = value.split("_");
			Position vp = new Position();
			vp.setVehicleno(element[0]);
			vp.setPlatecolor(Integer.parseInt(element[1]));
			vp.setPositiontime(Long.parseLong(element[2]));
			vp.setAccesscode(Integer.parseInt(element[3]));		
			vp.setCity(Integer.parseInt(element[4]));
			vp.setCuraccesscode(Integer.parseInt(element[5]));
			vp.setTrans(Integer.parseInt(element[6]));
			vp.setUpdatetime(Long.parseLong(element[7]));
			vp.setEncrypt(Integer.parseInt(element[8]));
			vp.setLon(Double.parseDouble(element[9]));
			vp.setLat(Double.parseDouble(element[10]));
			vp.setVec1(Integer.parseInt(element[11]));
			vp.setVec2(Integer.parseInt(element[12]));
			vp.setVec3(Integer.parseInt(element[13]));
			vp.setDirection(Integer.parseInt(element[14]));
			vp.setAltitude(Integer.parseInt(element[15]));
			vp.setState(Integer.parseInt(element[16]));
			vp.setAlarm(Integer.parseInt(element[17]));
			vp.setReserved(element[18]);		
			result.add(vp);
		}
		
		return result;
	}
	@Test
	public void scanResult() {
		Map<String, String> map = new HashMap<String, String>();
		map = HBaseUtil.byGet("cttic_posotion_cor", "178216AC026_2_1499275007", "178216AC026_2_1499275035", "d");
	}
	
}
