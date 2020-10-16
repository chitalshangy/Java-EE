package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;

public class UserAction {
    private Integer count=0;
    public UserAction(){
        System.out.println("创建了一个UserAction类对象。");
    }
    public Integer getCount(){
        return count;
    }
    //登录业务
    private UserBean loginUser;
    public UserBean getLoginUser(){
        return loginUser;
    }
    public void setLoginUser(UserBean loginUser){
        this.loginUser=loginUser;
    }
    public String login(){
        count++;//Action实例化情况测试
        UserService userServ=new UserService();
        if(userServ.login(loginUser)){
            return "loginsuccess";
        }
        return "loginfail";
    }
    //注册业务
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
            return "regsuccess";
        }
        return "regfail";
    }
}
