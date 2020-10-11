<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/11
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册页面</title>
    <script type="text/javascript" src="style/js/register.js"></script>
</head>
<body>
<form action="register" method="post">
    <table>
        <tr>
            <td>类型：</td>
            <td>
                <select id="type" name="type">
                    <option id="normal" value="normal">普通用户</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input id="username" name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input id="password" name="password" type="password"placeholder="密码长度请小于6位"></td>
        </tr>
        <tr>
            <td><input type="submit" value="确认" onclick="checkRegister()"></td>
            <td><input type="reset" value="取消" onclick="window.location.href='login.jsp'"></td>
        </tr>
    </table>
</form>
</body>
</html>
