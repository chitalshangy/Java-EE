<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/13
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<!--进行表单的撰写-->
<form action="login" method="post">
    <table>
        <tr>
            <td>请输入用户名：</td>
            <td><input name="loginUser.account" type="text"></td>
        </tr>
        <tr>
            <td>请输入密码：</td>
            <td><input name="loginUser.password" type="password"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录">
                <input type="button" value="注册" onclick="window.location.href='register.jsp'">
            </td>
            <td><input type="reset" value="取消"></td>
        </tr>
    </table>
</form>
</body>
</html>