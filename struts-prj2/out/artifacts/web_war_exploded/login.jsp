<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/13
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:text name="登录界面"/></title>
</head>
<body>
<!--增加action级别的错误提示-->
<s:actionerror/>
<!--增加标签-->
<s:fielderror/>
<!--进行表单的撰写-->
<form action="login" method="post">
    <table>
        <tr>
            <!--<td>请输入用户名：</td>-->
            <td><!--<input name="loginUser.account" type="text">-->
                <s:textfield name="loginUser.account" key="login.account.lable"/>
            </td>
        </tr>
        <tr>
            <!--<td>请输入密码：</td>-->
            <td><!--<input name="loginUser.password" type="password">-->
                <s:password name="loginUser.password" key="login.password.lable"/>
            </td>
        </tr>
        <tr>
            <td>
                <s:submit name="submit" key="login.submit.button"/>
                <!--<input type="submit" value="登录">-->
                <!--<input type="button"value="注册" onclick="window.location.href='register.jsp'">-->
            </td>
            <td>
                <s:reset name="reset" key="login.reset.button"/>
                <!--<input type="reset" value="取消">-->
            </td>
        </tr>
    </table>
</form>
</body>
</html>
