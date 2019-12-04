package com.example.demo_eureka_client.dao.domain;

import com.example.demo_eureka_client.bean.po.Sysconfig;
import com.example.demo_eureka_client.bean.po.SysconfigExample;
import com.example.demo_eureka_client.bean.po.SysconfigKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysconfigMapper {
    int countByExample(SysconfigExample example);

    int deleteByExample(SysconfigExample example);

    int deleteByPrimaryKey(SysconfigKey key);

    int insert(Sysconfig record);

    int insertSelective(Sysconfig record);

    List<Sysconfig> selectByExample(SysconfigExample example);

    Sysconfig selectByPrimaryKey(SysconfigKey key);

    int updateByExampleSelective(@Param("record") Sysconfig record, @Param("example") SysconfigExample example);

    int updateByExample(@Param("record") Sysconfig record, @Param("example") SysconfigExample example);

    int updateByPrimaryKeySelective(Sysconfig record);

    int updateByPrimaryKey(Sysconfig record);
}