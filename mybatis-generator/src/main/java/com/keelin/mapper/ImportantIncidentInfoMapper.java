package com.keelin.mapper;

import com.keelin.model.ImportantIncidentInfo;
import com.keelin.model.ImportantIncidentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImportantIncidentInfoMapper {
    int countByExample(ImportantIncidentInfoExample example);

    int deleteByExample(ImportantIncidentInfoExample example);

    int insert(ImportantIncidentInfo record);

    int insertSelective(ImportantIncidentInfo record);

    List<ImportantIncidentInfo> selectByExample(ImportantIncidentInfoExample example);

    int updateByExampleSelective(@Param("record") ImportantIncidentInfo record, @Param("example") ImportantIncidentInfoExample example);

    int updateByExample(@Param("record") ImportantIncidentInfo record, @Param("example") ImportantIncidentInfoExample example);
}