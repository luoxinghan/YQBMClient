<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<%=basePath %>/common/font-awesome-5.7.2/css/all.css">
<title></title>
</head>
<body>
	<div class="header">
		<h2 class="logo">缘起不灭 IMMORTAL</h2>
		<input type="checkbox" id="chk"/>
		<label for="chk" class="show-menu-btn">
			<i class="fas fa-ellipsis-h"></i>
		</label>
		
		<ul class="menu">
			<a href="<%=basePath %>">首页</a>
			<a href="https://www.mcbbs.net/forum.php">论坛</a>
			<a href="https://pan.baidu.com/">客户端</a>
			<a href="<%=basePath %>/UserServlet">人员</a>
			<a href="#">加入我们</a>
			<label for="chk" class="hide-menu-btn">
			  <i class="fas fa-times"></i>
			</label>
		</ul>
		
	</div>
</body>
</html>