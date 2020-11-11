package cn.edu.zjut.action;

import cn.edu.zjut.po.Address;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.UserService;

public class UserAction {
    private Customer loginUser;
    private Address address;
    public String login() {
        UserService userServ = new UserService();
        if (userServ.login(loginUser))
            return "success";
        else
            return "fail";
    }
    //增加地址
    public String addAddr() {
        UserService userServ = new UserService();
        if (userServ.addAddr(loginUser, address))
            return "success";
        else
            return "fail";
    }
    //删除地址
    public String delAddr(){
        UserService userServ = new UserService();
        if (userServ.delAddr(loginUser,address))
            return "success";
        else
            return "fail";
    }
    public Customer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
