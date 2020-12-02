package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;

public interface ICustomerDAO {
    //定义接口的save方法
    public void save(Customer transientInstance);
}
