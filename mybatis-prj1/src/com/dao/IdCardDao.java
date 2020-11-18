package com.dao;
import com.mybatis.po.Idcard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IdCardDao {

    public List<Idcard>selectAll();
    public List<Idcard> selectCodeById(Integer cust_id);
}
