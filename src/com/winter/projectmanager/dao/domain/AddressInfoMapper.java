package com.winter.projectmanager.dao.domain;

import com.winter.projectmanager.bean.po.AddressInfo;
import com.winter.projectmanager.bean.po.AddressInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressInfoMapper {
    int countByExample(AddressInfoExample example);

    int deleteByExample(AddressInfoExample example);

    int deleteByPrimaryKey(String consigneeid);

    int insert(AddressInfo record);

    int insertSelective(AddressInfo record);

    List<AddressInfo> selectByExample(AddressInfoExample example);

    AddressInfo selectByPrimaryKey(String consigneeid);

    int updateByExampleSelective(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByExample(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByPrimaryKeySelective(AddressInfo record);

    int updateByPrimaryKey(AddressInfo record);
}