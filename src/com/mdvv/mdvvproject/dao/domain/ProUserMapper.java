package com.mdvv.mdvvproject.dao.domain;

import com.mdvv.mdvvproject.bean.po.ProUser;
import com.mdvv.mdvvproject.bean.po.ProUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProUserMapper {
    int countByExample(ProUserExample example);

    int deleteByExample(ProUserExample example);

    int deleteByPrimaryKey(String usercode);

    int insert(ProUser record);

    int insertSelective(ProUser record);

    List<ProUser> selectByExample(ProUserExample example);

    ProUser selectByPrimaryKey(String usercode);

    int updateByExampleSelective(@Param("record") ProUser record, @Param("example") ProUserExample example);

    int updateByExample(@Param("record") ProUser record, @Param("example") ProUserExample example);

    int updateByPrimaryKeySelective(ProUser record);

    int updateByPrimaryKey(ProUser record);
}