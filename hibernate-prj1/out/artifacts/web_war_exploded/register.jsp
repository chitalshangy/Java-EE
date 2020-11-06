<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/11/5
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <s:textfield name="registerUser.name" label="请输入姓名"/>
    <s:radio name="registerUser.sex" list="#{true:'1',false:'0'}" label="性别(男：1；女：0)"/>
    <s:date format="yyyy-mm-dd" name="registerUser.birthday" var="生日"/>
    <s:textfield name="registerUser.contactInfo.phone" label="电话"/>
    <s:textfield name="registerUser.contactInfo.email" label="电子邮箱"/>
    <s:textfield name="registerUser.contactInfo.address" label="地址"/>
    <s:textfield name="registerUser.contactInfo.zipcode" label="邮政编码"/>
    <s:textfield name="registerUser.contactInfo.fax" label="传真"/>
    <s:submit value="注册"/>
    <s:reset value="取消"/>
</s:form>
</body>
</html>
