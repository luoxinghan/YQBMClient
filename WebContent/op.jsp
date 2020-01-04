<%@page import="xyz.yqbm.entity.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/style.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/op.css" />
<title>人员</title>
</head>
<body>
	<div class="container">
		<jsp:include page="./common/header.jsp"></jsp:include>
		<div class="content clearfix">
			<ul>
			<% for(int i = 0; i < users.size(); i++) { %>
	            <li>
	            	<div class="title"><%=users.get(i).getUserName() %></div>
	            	<img class="avatar" alt="" src="https://minotar.net/avatar/<%=users.get(i).getUserName() %>"/>
	            	<div class="bottom"><%=users.get(i).getRoleName() %></div>
            	</li>
			<%} %>
			</ul>
		</div>
		<jsp:include page="./common/footer.jsp"></jsp:include>
	</div>
</body>
</html>