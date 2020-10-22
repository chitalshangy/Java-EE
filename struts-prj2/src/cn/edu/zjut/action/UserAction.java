package cn.edu.zjut.action;

import cn.edu.zjut.bean.ShoppingCart;
import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class UserAction extends ActionSupport /*ServletRequestAware,ServletResponseAware,ServletContextAware*//*RequestAware, SessionAware, ApplicationAware*/ {
    //通过Map获取上下文信息
    //private Map<String, Object> request, session, application;

    /*@Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }*/

    /*private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext servletContext;
    private HttpSession session;
    private ServletContext application;
    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request=httpServletRequest;
        session=request.getSession();
        application=request.getServletContext();
    }
    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response=httpServletResponse;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext=servletContext;
    }*/
    //登录action编写
    private UserBean loginUser;

    public UserBean getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(UserBean loginUser) {
        this.loginUser = loginUser;
    }

    public String login() {
        //获取ActionContext对象
        //ActionContext ctx=ActionContext.getContext();
        //通过 ActionContext 对象获取请求、会话和上下文对象相关联的 Map 对象
        //request=(Map)ctx.get("request");
        //session=(Map)ctx.getSession();
        //application=(Map)ctx.getApplication();
        //访问 application 范围的属性值
        //Integer counter = (Integer) application.get("counter");
        //Integer counter=(Integer) application.getAttribute("counter");
        ActionContext ctx=ActionContext.getContext();

        Integer counter=(Integer)ctx.getApplication().get("counter");
        if (counter == null) counter = 1;
        else counter = counter + 1;
        //设置 application 范围的属性
        //application.put("counter", counter);
        //application.setAttribute("counter",counter);
        ctx.getApplication().put("counter",counter);
        UserService userServ = new UserService();
        if (userServ.login(loginUser)) {
            //设置 session 范围的属性
            //session.put("user", loginUser.getAccount());
            //session.setAttribute("user",loginUser.getAccount());
            ctx.getSession().put("user",loginUser.getAccount());
            //设置 request 范围的属性
            //request.put("tip", "您已登录成功");
            //request.setAttribute("tip","您已登录成功");
            ctx.put("tip","您已登录成功");
            //创建购物车对象
            ShoppingCart shoppingCart = new ShoppingCart();
            ctx.getSession().put("shoppingcart",shoppingCart);
            return "success";
        } else {
            return "fail";
        }
        /*UserService userServ=new UserService();
        if(userServ.login(loginUser)){
            this.addActionMessage(this.getText("login.success"));
            return "success";
        }
        else{
            this.addActionError(this.getText("login.error"));
            return "fail";
        }*/
    }

    //注册action编写
    private UserBean registerUser;

    public UserBean getRegisterUser() {
        return registerUser;
    }

    public void setRegisterUser(UserBean registerUser) {
        this.registerUser = registerUser;
    }

    public String register() {
        UserService userServ = new UserService();
        if (userServ.register(registerUser)) {
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

    public void validateRegister() {
        String repassword = registerUser.getRepassword();
        String password = registerUser.getPassword();
        if (!repassword.equals(password)) {
            this.addFieldError("registerUser.repassword", this.getText("两次输入密码不同！！！"));
        }
        String email = registerUser.getEmail();
        if (email == "" || !email.matches(("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"))) {
            this.addFieldError("registerUser.email", this.getText("请输入正确的邮箱格式！！！"));
        }
    }
}
