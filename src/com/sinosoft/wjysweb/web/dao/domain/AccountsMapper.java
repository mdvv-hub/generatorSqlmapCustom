package com.sinosoft.wjysweb.web.dao.domain;

import com.sinosoft.wjysweb.web.bean.po.Accounts;
import com.sinosoft.wjysweb.web.bean.po.AccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsMapper {
    int countByExample(AccountsExample example);

    int deleteByExample(AccountsExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    List<Accounts> selectByExample(AccountsExample example);

    Accounts selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByExample(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByPrimaryKeySelective(Accounts record);

    int updateByPrimaryKey(Accounts record);
}