package com.dao;

import com.mybatis.po.Customer;
import com.mybatis.po.Order;

import java.util.List;

public interface OrderDao {
    //根据顾客信息查询
    public List<Order> selectByCust_id(Integer cust_id);
}
