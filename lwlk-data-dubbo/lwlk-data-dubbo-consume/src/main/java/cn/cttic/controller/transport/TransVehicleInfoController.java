package cn.cttic.controller.transport;



import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;








import cn.cttic.model.transport.TransVehicleResult;
import cn.cttic.pojo.transport.TransVehicleInfoPojo;
import cn.cttic.reference.transport.TransVehicleInfoReference;
import cn.cttic.utils.PageResult;
import cn.cttic.utils.ResponseData;

@RestController
@RequestMapping("/lwlk/transport")
public class TransVehicleInfoController extends ResponseData {
	
	@Autowired
	private TransVehicleInfoReference transVehicleInfoReference;

	private static Logger logger = Logger.getLogger(TransVehicleInfoController.class);
	
	@RequestMapping(value = "/transvehicleinfo/page", method = RequestMethod.POST, consumes = "application/json")
	public PageResult get(HttpServletRequest request,
			@RequestBody TransVehicleInfoPojo pojo) {
		PageResult res = null;
		List<TransVehicleResult> result = null;
		try{
			String vehicleType = pojo.getVehicleType();
			Integer provinceCode = pojo.getProvinceCode();
			if (null == vehicleType || "".equals(vehicleType)) {
				res = this.getResult(false, 500, "请输入要查询车辆类型！",0,0,0,  null);
			} else {
				System.out.println("车辆类型："+vehicleType);
				HashMap<String, Object> map =  new HashMap<String, Object>();
				map.put("vehicleType", vehicleType);			
				if(provinceCode != null){
					map.put("provinceCode", provinceCode);
					map.put("groupby", "PROVINCE_CODE,VEHICLE_ZONE_CODE");
					result = transVehicleInfoReference.querySeatOrTonInCity(map);
				} else {
					map.put("groupby", "PROVINCE_CODE");
					result = transVehicleInfoReference.querySeatOrTonInProvince(map);
				}
				if(result.size() != 0){
					res = this.getResult(true, 200, "查询成功！",0,0,0,result);
				} else {
					res = this.getResult(true, 200, "结果不存在！",0,0,0,  null);
				}
			}
		}catch(Exception e){
			e.printStackTrace();res = this.getResult(false, 500, "系统内部错误！",0,0,0,  null);
		}
		return res;
	}
}
