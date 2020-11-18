package com.dao;

import com.mybatis.po.Customer;

import java.util.List;

public interface CustomerDao {
    //查询全部
    public List<Customer> selectAll();
    //根据id查询
    public Customer select(Integer id);
}
