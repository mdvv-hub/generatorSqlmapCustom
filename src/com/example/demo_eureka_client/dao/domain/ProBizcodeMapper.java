package com.example.demo_eureka_client.dao.domain;

import com.example.demo_eureka_client.bean.po.ProBizcode;
import com.example.demo_eureka_client.bean.po.ProBizcodeExample;
import com.example.demo_eureka_client.bean.po.ProBizcodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProBizcodeMapper {
    int countByExample(ProBizcodeExample example);

    int deleteByExample(ProBizcodeExample example);

    int deleteByPrimaryKey(ProBizcodeKey key);

    int insert(ProBizcode record);

    int insertSelective(ProBizcode record);

    List<ProBizcode> selectByExample(ProBizcodeExample example);

    ProBizcode selectByPrimaryKey(ProBizcodeKey key);

    int updateByExampleSelective(@Param("record") ProBizcode record, @Param("example") ProBizcodeExample example);

    int updateByExample(@Param("record") ProBizcode record, @Param("example") ProBizcodeExample example);

    int updateByPrimaryKeySelective(ProBizcode record);

    int updateByPrimaryKey(ProBizcode record);
}