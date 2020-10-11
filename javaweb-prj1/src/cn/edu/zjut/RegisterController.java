package cn.edu.zjut;

import cn.edu.zjut.Dao.UserDao;
import cn.edu.zjut.model.UserBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        //判断注册密码是否合理
        if(password.length()>6||password.equals("")){
            RequestDispatcher dispatcher=request.getRequestDispatcher("/register.jsp");
            dispatcher.forward(request,response);
        }
        else{
            //默认是普通用户
            UserBean user=new UserBean();
            user.setUsername(username);
            user.setPassword(password);
            UserDao ud=new UserDao();
            ud.insert(user);
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
