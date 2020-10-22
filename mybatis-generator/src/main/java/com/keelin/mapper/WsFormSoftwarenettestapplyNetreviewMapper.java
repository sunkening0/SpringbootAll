package com.keelin.mapper;

import com.keelin.model.WsFormSoftwarenettestapplyNetreview;
import com.keelin.model.WsFormSoftwarenettestapplyNetreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsFormSoftwarenettestapplyNetreviewMapper {
    int countByExample(WsFormSoftwarenettestapplyNetreviewExample example);

    int deleteByExample(WsFormSoftwarenettestapplyNetreviewExample example);

    int insert(WsFormSoftwarenettestapplyNetreview record);

    int insertSelective(WsFormSoftwarenettestapplyNetreview record);

    List<WsFormSoftwarenettestapplyNetreview> selectByExample(WsFormSoftwarenettestapplyNetreviewExample example);

    int updateByExampleSelective(@Param("record") WsFormSoftwarenettestapplyNetreview record, @Param("example") WsFormSoftwarenettestapplyNetreviewExample example);

    int updateByExample(@Param("record") WsFormSoftwarenettestapplyNetreview record, @Param("example") WsFormSoftwarenettestapplyNetreviewExample example);
}