package cn.cttic.controller.dynamic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;













import cn.cttic.model.dynamic.Position;
import cn.cttic.pojo.dynamic.VehiclePositionPojo;
import cn.cttic.reference.dynamic.VehiclePositionReference;
import cn.cttic.utils.PageResult;
import cn.cttic.utils.ResponseData;

@RestController
@RequestMapping("/lwlk/dynamic")
public class VehiclePositionController extends ResponseData {
	
	@Autowired
	private VehiclePositionReference vehPositionService;

	private static Logger logger = Logger.getLogger(VehiclePositionController.class);
	
	@RequestMapping(value = "/vehicleposition/get_vehicle_position_list", method = RequestMethod.POST, consumes = "application/json")
	public PageResult get(HttpServletRequest request,
			@RequestBody VehiclePositionPojo pojo){
		PageResult res = null;
		try{
			String vehicleNo = pojo.getVehicleNo();
			Integer plateColor = pojo.getPlateColor();
			String startPositionTime = pojo.getStartPositionTime();
			String endPositionTime = pojo.getEndPositionTime();
			if (null == vehicleNo || "".equals(vehicleNo)) {
				res = this.getResult(false, 500, "请输入要查询的车辆牌号！",0,0,0,  null);
			} else if (null == plateColor || "".equals(plateColor)) {
				res = this.getResult(false, 500, "请输入要查询的车牌颜色！",0,0,0,  null);
			} else if (null == startPositionTime || "".equals(startPositionTime)) {
				res = this.getResult(false, 500, "请输入要查询的定位时间的开始时间！",0,0,0,  null);
			} else if (null == endPositionTime || "".equals(endPositionTime)) {
				res = this.getResult(false, 500, "请输入要查询的定位时间的结束时间！",0,0,0,  null);
			} else {
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date startDate = sdf.parse(startPositionTime);
				Date endDate = sdf.parse(endPositionTime);
				Long startTime = startDate.getTime();
				Long endTime = endDate.getTime();
				
				StringBuffer value = new StringBuffer();
				value = value.append(vehicleNo).append("_").append(plateColor.toString()).append("_").
				append(startTime).append("_").append(endTime);
				
				System.out.println("前台输入的查询条件："+value.toString());
				
				HashMap<String,String> map = new HashMap<String,String>();
				map.put("rowkey", value.toString());
				List<Position> result = vehPositionService.queryVehiclePosition(map);
				
				if (result != null) {
					res = this.getResult(true, 200, "查询成功！",0,0,0,result);
				} else {
					res = this.getResult(true, 200, "查询结果不存在！",0,0,0,null);
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
			res = this.getResult(false, 500, "系统内部错误！",0,0,0,  null);
		}
		return res;
	}
}
