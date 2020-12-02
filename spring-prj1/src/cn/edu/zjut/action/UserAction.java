package cn.edu.zjut.action;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;

import java.io.PushbackReader;

public class UserAction {
    private Customer loginUser;
    private IUserService userService = null;
    //get以及set方法
    public Customer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }

    public void setUserService(IUserService userService){
        this.userService = userService;
    }
    //action默认执行方法
    public String execute(){
        userService.register(loginUser);
        return "success";
    }
}
