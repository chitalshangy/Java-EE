package cn.edu.zjut.service;

import cn.edu.zjut.dao.BaseHibernateDAO;
import cn.edu.zjut.dao.ICustomerDAO;
import cn.edu.zjut.po.Customer;

public class UserService extends BaseHibernateDAO implements IUserService{
    private ICustomerDAO customerDAO = null;
    /*
    public UserService(){
        System.out.println("create UserService.");
    }
    */

    public void setCustomerDAO(ICustomerDAO customerDAO){
        //System.out.println("--setCustomerDAO--");
        this.customerDAO = customerDAO;
    }

    //实现接口的注册方法
    public void register(Customer transientInstance){
        //System.out.println("execute --register()-- method.");
        customerDAO.save(transientInstance);
    }
}
