package cn.edu.zjut.service;

import cn.edu.zjut.po.Customer;

public interface IUserService {
    //定义Service的注册方法
    public void register(Customer transientInstance);
}
