package cn.edu.zjut.service;

import cn.edu.zjut.bean.UserBean;

public class UserService {
    //登录判断
    public boolean login(UserBean loginUser){
        if(loginUser.getAccount().equals(loginUser.getPassword())){
            return true;
        }
        return  false;
    }
    //注册判断
    public boolean register(UserBean registerUser){
        if(registerUser.getAccount().equals(registerUser.getPassword())&&
                registerUser.getAccount().equals(registerUser.getRepassword())){
            return true;
        }
        return false;
    }
}
