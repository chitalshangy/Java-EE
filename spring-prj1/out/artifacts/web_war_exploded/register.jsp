<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/12/2
  Time: 16:24
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
    <s:textfield name="loginUser.account" label="请输入账号"/>
    <s:password name="loginUser.password" label="请输入密码"/>
    <s:textfield name="loginUser.name" label="请输入姓名"/>
    <s:radio name="loginUser.sex" list="#{true:'1',false:'0'}" label="性别(男：1；女：0)"/>
    <s:textfield name="loginUser.phone" label="电话号码"/>
    <s:textfield name="loginUser.email" label="电子邮件"/>
    <s:textfield name="loginUser.address" label="地址"/>
    <s:textfield name="loginUser.zipcode" label="邮政编码"/>
    <s:textfield name="loginUser.fax" label="传真"/>
    <s:submit value="确认"/><s:reset value="取消"/>
</s:form>
</body>
</html>
