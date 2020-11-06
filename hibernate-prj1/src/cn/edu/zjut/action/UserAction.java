package cn.edu.zjut.action;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.UserService;
public class UserAction {
    //登录
    private Customer loginUser;
    public Customer getLoginUser() {
        return loginUser;
    }
    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }
    public String login() {
        UserService userServ = new UserService();
        if (userServ.login(loginUser)) {
            return "success";
        }
        return "fail";
    }


    //注册
    //将private改为public就不会出现空指针错误
    public Customer registerUser;
    public Customer getRegisterUser() {
        return registerUser;
    }
    public void setregisterUser(Customer registerUser) {
        this.registerUser = registerUser;
    }
    public String register(){
        UserService userServ=new UserService();
        userServ.register(registerUser);
        return "registersuccess";
    }
}