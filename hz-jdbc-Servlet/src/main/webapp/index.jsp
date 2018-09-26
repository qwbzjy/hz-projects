<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录表单</title>
</head>

<body>
<h2>登录表单</h2>
<form action="loginServlet" method="post">
    <label>用户名：</label>
    <input type="text" name="username" value="zs"/>
    <label>密码</label>
    <input type="password" name="password" value="111"/>
    <label><input type="submit" value="登录"/></label>
</form>
</body>
</html>
