<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/11/3
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
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
            <td><input type="submit" value="登录"></td>
            <td><input type="reset" value="取消"></td>
        </tr>
    </table>
</form>
</body>
</html>
