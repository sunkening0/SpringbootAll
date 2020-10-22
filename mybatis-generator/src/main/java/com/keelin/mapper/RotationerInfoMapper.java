package com.keelin.mapper;

import com.keelin.model.RotationerInfo;
import com.keelin.model.RotationerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RotationerInfoMapper {
    int countByExample(RotationerInfoExample example);

    int deleteByExample(RotationerInfoExample example);

    int insert(RotationerInfo record);

    int insertSelective(RotationerInfo record);

    List<RotationerInfo> selectByExample(RotationerInfoExample example);

    int updateByExampleSelective(@Param("record") RotationerInfo record, @Param("example") RotationerInfoExample example);

    int updateByExample(@Param("record") RotationerInfo record, @Param("example") RotationerInfoExample example);
}