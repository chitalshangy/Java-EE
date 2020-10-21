package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
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
            this.addActionMessage(this.getText("login.success"));
            return "success";
        }
        else{
            this.addActionError(this.getText("login.error"));
            return "fail";
        }

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
    //增加对用户的请求参数的校验
    public void validateLogin() {
        String account = loginUser.getAccount();
        String pwd = loginUser.getPassword();
        if (account == null || account.equals("")) {
            this.addFieldError("loginUser.account", this.getText("login.account.null"));
        }
        if (pwd == null || pwd.equals("")) {
            this.addFieldError("loginUser.password", this.getText("login.password.null"));
        }
    }
    public void validateRegister(){
        String repassword=registerUser.getRepassword();
        String password=registerUser.getPassword();
        if(!repassword.equals(password)){
            this.addFieldError("registerUser.repassword",this.getText("两次输入密码不同！！！"));
        }
        String email=registerUser.getEmail();
        if(email==""||!email.matches(("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"))){
            this.addFieldError("registerUser.email",this.getText("请输入正确的邮箱格式！！！"));
        }
    }
}
