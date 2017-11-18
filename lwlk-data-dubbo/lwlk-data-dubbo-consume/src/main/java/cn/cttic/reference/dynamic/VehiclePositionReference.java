package cn.cttic.reference.dynamic;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.cttic.model.dynamic.Position;
import cn.cttic.service.dynamic.VehiclePositionService;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class VehiclePositionReference {

	@Reference(group = "vehiclePosition", version = "1.0")
	private VehiclePositionService vehiclePositionService;

	public List<Position> queryVehiclePosition(
			HashMap<String, String> conditions) {
		// System.out.println(vehicelPositionService);
		return vehiclePositionService.queryVehiclePosition(conditions);

	}
}
