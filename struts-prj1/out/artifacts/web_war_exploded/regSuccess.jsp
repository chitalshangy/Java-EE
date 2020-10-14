<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/13
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册成功</title>
</head>
<body>
<s:property value="registerUser.name"/>
<s:if test="%{registerUser.sex==\"1\"}">
    <s:text name="先生，"/>
</s:if>
<s:else>
    <s:text name="女士，"/>
</s:else>
您注册成功了！
<s:set value="loginUser" scope="session" var="user"/>
</body>
</html>
