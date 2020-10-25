package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;
import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

public class UserAction {
    private UserBean loginUser;
    public UserBean getLoginUser(){
        return loginUser;
    }
    public void setLoginUser(UserBean loginUser){
        this.loginUser=loginUser;
    }

    //获取session
    private Map session;
    //登录
    public String login() throws Exception {
        //获取信息
        ActionContext ctx=ActionContext.getContext();
        session=(Map)ctx.getSession();

        //新建登录用户
        UserService userServ=new UserService();
        try{
            if(userServ.login(loginUser)){
                session.put("user",loginUser.getAccount());
                return "success";
            }
            else return "fail";
        }
        catch (Exception e){
            /*捕获异常，跳转视图
            e.printStackTrace();
            return "exception";
            */
            /*将异常交给框架*/
            throw e;
        }
    }
}
