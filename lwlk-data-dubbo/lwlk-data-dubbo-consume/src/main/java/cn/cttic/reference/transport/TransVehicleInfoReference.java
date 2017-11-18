package cn.cttic.reference.transport;

import java.util.HashMap;
import java.util.List;









import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.cttic.model.transport.TransVehicleResult;
import cn.cttic.service.transport.TransVehicleInfoService;

@Service
public class TransVehicleInfoReference {
	@Reference(group = "transVehicleInfoServices" , version = "1.0")
	private TransVehicleInfoService transVehicleInfoSercice;

	//查询精确到市：通过province_code和vehicle_zone_code进行分组
    public List<TransVehicleResult> querySeatOrTonInCity(HashMap<String, Object> map){
    	return transVehicleInfoSercice.querySeatOrTonInCity(map);
    }
    //查询精确到省：通过province_code进行分组
    public List<TransVehicleResult> querySeatOrTonInProvince(HashMap<String, Object> map){
    	return transVehicleInfoSercice.querySeatOrTonInProvince(map);
    }
}
