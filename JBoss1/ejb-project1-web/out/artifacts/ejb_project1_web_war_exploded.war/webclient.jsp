<%--
  Created by IntelliJ IDEA.
  User: Chital
  Date: 2020/12/23
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="javax.naming.*, java.util.Properties"%>
<%@ page import="cn.edu.zjut.ejb.*"%>
<%
    try{
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES,
                "org.jboss.ejb.client.naming");
        final Context context = new InitialContext(jndiProperties);
        final String appName = "";
        final String moduleName = "ejb_project1";
        final String distinctName = "";
        final String beanName = "UserService";
        final String viewClassName = UserServiceRemote.class.getName();
        final String namespace = "ejb:" + appName + "/" + moduleName
                + "/" + distinctName + "/" + beanName + "!" + viewClassName;
        UserServiceRemote usBean =(UserServiceRemote)
                context.lookup(namespace);
        System.out.println(usBean);
        if(usBean.login("zjut","zjut"))
            out.println("login ok!");
        else
            out.println("login failed!");
    }catch(NamingException e){
        e.printStackTrace();
    }
%>
