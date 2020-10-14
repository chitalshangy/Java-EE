package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;

public class UserAction {
    //登录action编写
    private UserBean loginUser;
    public UserBean getLoginUser(){
        return loginUser;
    }
    public void setLoginUser(UserBean loginUser){
        this.loginUser=loginUser;
    }
    public String login(){
        UserService userServ=new UserService();
        if(userServ.login(loginUser)){
            return "success";
        }
        return "fail";
    }
    //注册action编写
    private UserBean registerUser;
    public UserBean getRegisterUser(){
        return registerUser;
    }
    public void setRegisterUser(UserBean registerUser){
        this.registerUser=registerUser;
    }
    public String register(){
        UserService userServ=new UserService();
        if(userServ.register(registerUser)){
            return "success";
        }
        return "fail";
    }
}
