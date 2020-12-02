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
    <title>注册成功</title>
</head>
<body>
<s:property value="loginUser.name"/>
<s:if test="%{loginUser.sex==true}">
   <s:text name="先生,"/>
</s:if>
<s:else>
    <s:text name="女士,"/>
</s:else>
<s:text name="注册成功！"/>
<s:set var="user" value="loginUser" scope="session"/>
</body>
</html>
