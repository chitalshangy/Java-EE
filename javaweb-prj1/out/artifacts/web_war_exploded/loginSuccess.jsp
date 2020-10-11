<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/10
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
         import="cn.edu.zjut.model.UserBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登录成功</title>
</head>
<body>
<%UserBean user = (UserBean) (request.getAttribute("USER"));%>
登录成功，欢迎您，<%=user.getUsername()%>!
</body>
</html>
