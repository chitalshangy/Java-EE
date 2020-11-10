<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/11/9
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<s:form action="login" method="post">
    <s:textfield name="loginUser.account" label="请输入用户名"/>
    <s:password name="loginUser.password" label="请输入密码"/>
    <s:submit value="登录"/>
    <s:reset value="取消"/>
</s:form>
</body>
</html>
