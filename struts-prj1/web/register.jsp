<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/13
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>注册界面</title>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/> </head>
</head>
<body>
<s:form action="register" method="post">
    <s:textfield name="registerUser.account" label="请输入用户名"/>
    <s:password name="registerUser.password" label="请输入密码"/>
    <s:password name="registerUser.repassword" label="请确认密码"/>
    <s:textfield name="registerUser.name" label="真实姓名"/>
    <s:radio name="registerUser.sex" list="#{1  : '男', 0 : '女'}" label="请输入性别"/>
    <sx:datetimepicker name="registerUser.birthday" displayFormat="yyyy-MM-dd" label="请输入生日"/>
    <s:textfield name="registerUser.address" label="联系地址"/>
    <s:textfield name="registerUser.phone" label="联系电话"/>
    <s:textfield name="registerUser.email" label="电子邮箱"/>
    <s:submit value="注册"/><s:reset value="重置"/>
</s:form>
</body>
</html>
