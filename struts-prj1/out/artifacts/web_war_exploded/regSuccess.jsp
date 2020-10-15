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
    <title><s:text name="registerSuccess"/></title>
</head>
<body>
<s:property value="registerUser.name"/>
<s:if test="%{registerUser.sex==\"1\"}">
    <s:text name="Mister"/>
</s:if>
<s:else>
    <s:text name="Madam"/>
</s:else>
<s:text name="registerSuccess.info"/>
<s:set var="user" value="loginUser" scope="session" />
</body>
</html>
