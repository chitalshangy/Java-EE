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
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        /*一次失败的乱码解决方案
        PrintWriter out=response.getWriter();罪魁祸首
        String type=new String(request.getParameter("type"));//.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        */
        String type = request.getParameter("type");
        UserBean user = new UserBean();
        user.setUsername(username);
        user.setPassword(password);
        user.setType(type);
        if (checkUser(user)) {
            request.setAttribute("USER", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/loginSuccess.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("loginFailed.jsp");
        }
    }

    boolean checkUser(UserBean user) {
        UserDao ud=new UserDao();
        if(ud.searchUser(user)){
            return true;
        }
        return false;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
