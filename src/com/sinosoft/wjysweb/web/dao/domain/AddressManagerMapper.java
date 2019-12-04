package com.sinosoft.wjysweb.web.dao.domain;

import com.sinosoft.wjysweb.web.bean.po.AddressManager;
import com.sinosoft.wjysweb.web.bean.po.AddressManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressManagerMapper {
    int countByExample(AddressManagerExample example);

    int deleteByExample(AddressManagerExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(AddressManager record);

    int insertSelective(AddressManager record);

    List<AddressManager> selectByExample(AddressManagerExample example);

    AddressManager selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") AddressManager record, @Param("example") AddressManagerExample example);

    int updateByExample(@Param("record") AddressManager record, @Param("example") AddressManagerExample example);

    int updateByPrimaryKeySelective(AddressManager record);

    int updateByPrimaryKey(AddressManager record);
}