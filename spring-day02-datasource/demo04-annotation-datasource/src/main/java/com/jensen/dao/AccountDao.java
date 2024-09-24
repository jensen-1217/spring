package com.jensen.dao;

import com.jensen.pojo.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 数据访问层, 这个接口中的方法操作 tbl_account 表
public interface AccountDao {
    @Select("SELECT * FROM tbl_account;")
    List<Account> findAll();
}
