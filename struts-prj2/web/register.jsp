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
    <title><s:text name="注册界面"/></title>
    <!--注释此局后可防止高亮-->
    <!--s:head theme="xhtml"/-->
    <sx:head parseContent="true" extraLocales="UTF-8"/>
</head>
<body>
<!--增加field级别的错误提示-->
<s:fielderror/>
<s:form action="register" method="post">
    <s:textfield name="registerUser.account" key="login.account.lable"/>
    <s:password name="registerUser.password" key="login.password.lable"/>
    <s:password name="registerUser.repassword" key="register.repassword.lable"/>
    <s:textfield name="registerUser.name" key="register.name.lable"/>
    <s:radio name="registerUser.sex" list="#{1  : getText('male'), 0 : getText('female')}" key="register.sex.lable"/>
    <sx:datetimepicker name="registerUser.birthday" displayFormat="yyyy-MM-dd" key="register.birthday.lable"/>
    <s:textfield name="registerUser.address" key="register.address.lable"/>
    <s:textfield name="registerUser.phone" key="register.phone.lable"/>
    <s:textfield name="registerUser.email" key="register.email.lable"/>
    <s:submit key="register.submit.button"/><s:reset key="login.reset.button"/>
</s:form>
</body>
</html>
