package cn.cttic.service.transport.impl;

import java.util.HashMap;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import cn.cttic.dao.mybatis.transport.TransVehicleInfoMapper;
import cn.cttic.model.transport.TransVehicleResult;
import cn.cttic.service.transport.TransVehicleInfoService;

@Service(group = "transVehicleInfoServices",version = "1.0")
public class TransVehicleInfoServiceImpl implements TransVehicleInfoService {
	
	@Autowired
	private TransVehicleInfoMapper transVehicleInfoMapper;

	@Override
	public List<TransVehicleResult> querySeatOrTonInCity(HashMap<String, Object> map) {
		return transVehicleInfoMapper.querySeatOrTonInCity(map);
	}

	@Override
	public List<TransVehicleResult> querySeatOrTonInProvince(HashMap<String, Object> map) {
		return transVehicleInfoMapper.querySeatOrTonInProvince(map);
	}

}
