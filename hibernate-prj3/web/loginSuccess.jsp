<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/11/9
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<table>
    <tr><td>个人信息：</td></tr>
    <tr><td>用户名：</td><td><s:property value="#request.loginUser.account"/></td></tr>
    <tr><td>用户密码：</td><td><s:property value="#request.loginUser.password"/> </td></tr>
    <tr><td>用户真实姓名：</td><td><s:property value="#request.loginUser.name"/> </td></tr>
    <tr><td>用户性别：</td><td><s:property value="#request.loginUser.sex"/> </td></tr>
    <tr><td>用户生日：</td><td><s:property value="#request.loginUser.birthday"/> </td></tr>
    <tr><td>用户电子邮件：</td><td><s:property value="#request.loginUser.email"/> </td></tr>
</table>
<hr>
<table>
<s:if test="#request.loginUser.addressid">
    <s:form action="delAddr" method="post">
    <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
    <tr><td>详细地址：</td><td><s:property value="#request.loginUser.addressid.detail" /></td><tr>
    <tr><td>邮政编码：</td><td><s:property value="#request.loginUser.addressid.zipcode" /></td></tr>
    <tr><td>电话：</td><td><s:property value="#request.loginUser.addressid.phone"/> </td></tr>
    <tr><td>地址类型：</td><td><s:property value="#request.loginUser.addressid.type"/> </td></tr>
    <tr><td><s:submit value="删除"/></td><tr>
    </s:form>
</s:if>
</table>
<hr>
<table>
<s:else>
    添加新地址：<p>
    <s:form action="addAddr" method="post">
    <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
    <s:textfield name="address.detail" label="详细地址" />
    <s:textfield name="address.zipcode" label="邮政编码" />
    <s:textfield name="address.phone" label="联系电话" />
    <s:textfield name="address.type" label="地址类型（office,home,etc.）" />
    <s:submit value="添加"/>
    </s:form>
</s:else>
</table>
</body>
</html>
