package cn.cttic.service.dynamic.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.cttic.dao.dynamic.VehiclePosition;
import cn.cttic.model.dynamic.Position;
import cn.cttic.service.dynamic.VehiclePositionService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(group = "vehiclePosition", version = "1.0")
public class VehiclePositionServiceImpl implements VehiclePositionService {

	@Autowired
	private VehiclePosition vehiclePositionDao;

	@Override
	public List<Position> queryVehiclePosition(
			HashMap<String, String> conditions) {
		System.out.println(vehiclePositionDao);
		return vehiclePositionDao.queryVehiclePosition(conditions);
	}

}
