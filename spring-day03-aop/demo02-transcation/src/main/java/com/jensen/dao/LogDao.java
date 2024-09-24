package com.jensen.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    @Insert("insert into tbl_log (info,create_date) values(#{info},now())")
    void log(String info);
}
