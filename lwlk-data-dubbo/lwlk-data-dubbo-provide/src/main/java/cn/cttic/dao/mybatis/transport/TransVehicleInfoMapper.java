package cn.cttic.dao.mybatis.transport;

import cn.cttic.model.transport.TransVehicleInfo;
import cn.cttic.model.transport.TransVehicleInfoExample;
import cn.cttic.model.transport.TransVehicleResult;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TransVehicleInfoMapper {
    int countByExample(TransVehicleInfoExample example);

    int deleteByExample(TransVehicleInfoExample example);

    int insert(TransVehicleInfo record);

    int insertSelective(TransVehicleInfo record);

    List<TransVehicleInfo> selectByExample(TransVehicleInfoExample example);

    int updateByExampleSelective(@Param("record") TransVehicleInfo record, @Param("example") TransVehicleInfoExample example);

    int updateByExample(@Param("record") TransVehicleInfo record, @Param("example") TransVehicleInfoExample example);
    
    //查询精确到市：通过province_code和vehicle_zone_code进行分组
    List<TransVehicleResult> querySeatOrTonInCity(HashMap<String, Object> map); 
    //查询精确到省：通过province_code进行分组
    List<TransVehicleResult> querySeatOrTonInProvince(HashMap<String, Object> map);
}