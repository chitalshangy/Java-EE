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
    <title><s:text name="注册成功"/></title>
</head>
<body>
<s:property value="registerUser.name"/>
<s:if test="%{registerUser.sex==\"1\"}">
    <s:text name="先生，"/>
</s:if>
<s:else>
    <s:text name="女士，"/>
</s:else>
<s:text name="您注册成功了！"/>
<s:set var="user" value="loginUser" scope="session" />
</body>
</html>