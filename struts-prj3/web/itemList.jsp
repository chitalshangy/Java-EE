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
    <title>��Ʒ��Ϣ</title>
</head>
<body>
<!--%
    ValueStack vs=(ValueStack)request.getAttribute("struts.valueStack");
    String title=vs.findString("tableTitle");
    List itemList=(List)vs.findValue("items");
%-->
<s:property value="#session.user"/>,���ã�
<center>��Ʒ�б�</center>
<table border=1>
    <tr>
        <th>���</th><th>����</th><th>˵��</th><th>����</th>
    </tr>
    <!--����ʵ��Ĵ���-->
    <s:iterator value="items" >
        <tr>
            <td><s:property value="itemID"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="description"/></td>
            <td><s:property value="cost"/></td>
        </tr>
    </s:iterator>
    �۸����20Ԫ����Ʒ�У�<br>
    <s:iterator value="items.{?#this.cost<20}">
        <li>
            <s:property value="name"/>:
            <s:property value="cost"/>Ԫ
        </li>
    </s:iterator>
    <p>
        ����Ϊ��JAVAEE����ʵ��ָ���̡̳�����Ʒ�۸�Ϊ��
        <s:property value="items.{?#this.name=='JAVAEE ����ʵ��ָ���̳�'}.{cost}[0]"/>Ԫ
    </p>
    ------------------------------------------------------<br><br>
    ��ʹ��%��ʹ��%������<br>
    <s:url value="items.{name}[0]"/><br>
    <s:url value="%{items.{name}[0]}"/><br>
    ------------------------------------------------------<br><br>
    <!--ʹ��ֵջ�����ȡ����-->
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
