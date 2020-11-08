<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/11/8
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<s:form action="register" method="post">
    <s:textfield name="loginUser.account" label="请输入用户名"/>
    <s:password name="loginUser.password" label="请输入密码"/>
    <s:textfield name="loginUser.name" label="请输入姓名"/>
    <s:radio name="loginUser.sex" list="#{true:'1',false:'0'}" label="性别(男：1；女：0)"/>
    <!--s:datetextfield format="yyyy-mm-dd" name="loginUser.birthday" var="生日"/-->
    <s:textfield name="loginUser.phone" label="电话"/>
    <s:textfield name="loginUser.email" label="电子邮箱"/>
    <s:textfield name="loginUser.address" label="地址"/>
    <s:textfield name="loginUser.zipcode" label="邮政编码"/>
    <s:textfield name="loginUser.fax" label="传真"/>
    <s:submit value="注册"/>
    <s:reset value="取消"/>
</s:form>
</body>
</html>
