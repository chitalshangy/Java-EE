<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/9
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>用户登录页面</title>
    <!--<link rel="stylesheet"type="text/css"href="style/css/login.css">-->
    <script type="text/javascript" src="style/js/login.js"></script>
</head>
<body>
<form action="login" method="post">
    <table>
        <tr>
            <td>类型：</td>
            <td>
                <select id="type" name="type">
                    <option id="normal" value="normal">普通用户</option>
                    <option id="admin" value="admin">管理员</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>请输入用户名：</td>
            <td><input id="username" name="username" type="text"></td>
        </tr>
        <tr>
            <td>请输入密码：</td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录" onclick="checkPassword()">
                <!--添加注册按钮，添加onclick事件-->
                <input type="button"value="注册"onclick="window.location.href='register.jsp'">
            </td>
            <td><input type="reset" value="取消"></td>
        </tr>
    </table>
    <!--请输入用户名：<input name="username"type="text"><br>
    请输入密码：<input name="password"type="password"><br><br>
    <input type="submit"value="登录"><input type="reset"value="取消">-->
</form>
</body>
</html>
