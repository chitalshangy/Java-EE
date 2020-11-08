<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/11/8
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<s:property value="#request.tip"/><p>
    修改个人信息<p>
    <a href="./findItems">查看商品信息</a>
    <s:form action="update" method="post">
        <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
        <s:textfield name="loginUser.account" label="用户名不能修改" value="%{#request.loginUser.account}" readonly="true"/>
        <s:textfield name="loginUser.name" label="修改姓名" value="%{#request.loginUser.name}"/>
        <s:textfield type="password" name="loginUser.password" label="修改密码" value="%{#request.loginUser.password}"/>
        <s:textfield name="loginUser.sex" label="修改性别" value="%{#request.loginUser.sex}"/>
        <!--s:datetextfield format="yyyy-mm-dd" name="loginUser.birthday" label="修改生日" value="%{#request.loginUser.birthday}"/-->
        <s:textfield name="loginUser.phone" label="修改电话" value="%{#request.loginUser.phone}"/>
        <s:textfield name="loginUser.email" label="修改电子邮件" value="%{#request.loginUser.email}"/>
        <s:textfield name="loginUser.address" label="修改地址" value="%{#request.loginUser.address}"/>
        <s:textfield name="loginUser.zipcode" label="修改邮政编码" value="%{#request.loginUser.zipcode}"/>
        <s:textfield name="loginUser.fax" label="修改传真" value="%{#request.loginUser.fax}"/>
        <s:submit value="修改"/>
        <s:reset value="取消"/>
    </s:form>
    <s:form action="delete" method="post">
        <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
        <s:submit value="删除"/>
    </s:form>
</body>
</html>
