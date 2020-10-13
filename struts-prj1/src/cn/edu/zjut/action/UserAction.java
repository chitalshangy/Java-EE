package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;

public class UserAction {
    private UserBean loginUser;
    public UserBean getLoginUser(){
        return loginUser;
    }
    public void setLoginUser(UserBean loginUser){
        this.loginUser=loginUser;
    }
    public String execute(){
        UserService userServ=new UserService();
        if(userServ.login(loginUser)){
            return "success";
        }
        return "fail";
    }
    /*private UserBean registerUser;
    public UserBean getRegisterUser(){
        return registerUser;
    }
    public void setRegisterUser(UserBean registerUser){
        this.registerUser=registerUser;
    }
    public String excute(){
        UserService userServ=new UserService();
        if(userServ.register(registerUser)){
            return "success";
        }
        return "fail";
    }*/
}
