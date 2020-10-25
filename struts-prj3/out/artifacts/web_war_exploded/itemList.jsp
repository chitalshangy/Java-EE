<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/10/24
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=GB18030"
         pageEncoding="GB18030"
         import="com.opensymphony.xwork2.util.ValueStack,
java.util.List,java.util.Iterator,
cn.edu.zjut.bean.Item"%>
<!--%@ page contentType="text/html;charset=UTF-8" language="java" %-->
<html>
<head>
    <title>商品信息</title>
</head>
<body>
<!--%
    ValueStack vs=(ValueStack)request.getAttribute("struts.valueStack");
    String title=vs.findString("tableTitle");
    List itemList=(List)vs.findValue("items");
%-->
<s:property value="#session.user"/>,您好！
<center>商品列表</center>
<table border=1>
    <tr>
        <th>编号</th><th>书名</th><th>说明</th><th>单价</th>
    </tr>
    <!--基础实验的代码-->
    <s:iterator value="items" >
        <tr>
            <td><s:property value="itemID"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="description"/></td>
            <td><s:property value="cost"/></td>
        </tr>
    </s:iterator>
    价格低于20元的商品有：<br>
    <s:iterator value="items.{?#this.cost<20}">
        <li>
            <s:property value="name"/>:
            <s:property value="cost"/>元
        </li>
    </s:iterator>
    <p>
        名称为《JAVAEE技术实验指导教程》的商品价格为：
        <s:property value="items.{?#this.name=='JAVAEE 技术实验指导教程'}.{cost}[0]"/>元
    </p>
    ------------------------------------------------------<br><br>
    不使用%和使用%的区别<br>
    <s:url value="items.{name}[0]"/><br>
    <s:url value="%{items.{name}[0]}"/><br>
    ------------------------------------------------------<br><br>
    <!--使用值栈对象获取属性-->
    <!--% Iterator it=itemList.iterator();while(it.hasNext()){Item item=(Item)it.next();%-->
    <!--tr-->
        <!--td--><!--%=item.getItemID()%--><!--/td-->
        <!--td--><!--%=item.getName()%--><!--/td-->
        <!--td--><!--%=item.getDescription()%--><!--/td-->
        <!--td--><!--%=item.getCost()%--><!--/td-->
    <!--/tr-->
    <!--%}%-->
</table>
</body>
</html>
