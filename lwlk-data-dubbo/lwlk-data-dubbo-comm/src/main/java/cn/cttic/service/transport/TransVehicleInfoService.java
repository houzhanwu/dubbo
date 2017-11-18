package cn.cttic.service.transport;

import java.util.HashMap;
import java.util.List;


import cn.cttic.model.transport.TransVehicleResult;

/**
 * 以车辆类型为条件，查询出客车（座位数），货车（吨数），地区到地市（钻取到地市）
 * @author wy
 *
 */
public interface TransVehicleInfoService {

	//查询精确到市：通过province_code和vehicle_zone_code进行分组
    List<TransVehicleResult> querySeatOrTonInCity(HashMap<String, Object> map); 
    //查询精确到省：通过province_code进行分组
    List<TransVehicleResult> querySeatOrTonInProvince(HashMap<String, Object> map);
}
