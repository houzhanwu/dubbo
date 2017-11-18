package cn.cttic.dao.mybatis;

import cn.cttic.model.test.OfflineInfo;
import cn.cttic.model.test.OfflineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfflineInfoMapper {
    int countByExample(OfflineInfoExample example);

    int deleteByExample(OfflineInfoExample example);

    int insert(OfflineInfo record);

    int insertSelective(OfflineInfo record);

    List<OfflineInfo> selectByExample(OfflineInfoExample example);

    int updateByExampleSelective(@Param("record") OfflineInfo record, @Param("example") OfflineInfoExample example);

    int updateByExample(@Param("record") OfflineInfo record, @Param("example") OfflineInfoExample example);
}