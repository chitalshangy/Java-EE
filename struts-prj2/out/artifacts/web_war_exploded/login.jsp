<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/16
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:text name="登录界面"/></title>
</head>
<body>
<!--进行表单的撰写-->
<form action="login" method="post">
    <table>
        <tr>
            <td><s:textfield name="loginUser.account" label="请输入用户名"/></td>
        </tr>
        <tr>
            <td><s:password name="loginUser.password" label="请输入密码"/></td>
        </tr>
        <tr>
            <td>
                <s:submit name="submit" value="登录"/>
            </td>
            <td>
                <s:reset name="reset" value="取消"/>
            </td>
        </tr>
    </table>
</form>
</body>
