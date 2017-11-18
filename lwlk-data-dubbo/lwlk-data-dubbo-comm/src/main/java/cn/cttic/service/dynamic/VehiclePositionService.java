package cn.cttic.service.dynamic;

import java.util.HashMap;
import java.util.List;

import cn.cttic.model.dynamic.Position;

public interface VehiclePositionService {

	//按条件查询车辆轨迹，条件就是车牌号码，车牌颜色和定位时间
	public List<Position> queryVehiclePosition(HashMap<String, String> conditions);
}
