<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/style.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/index.css" />
<title>缘起不灭</title>
</head>
<body>
	<div class="container">
		<jsp:include page="./common/header.jsp"></jsp:include>
		<div class="content">
			<center>
				<img class="head-img" src="./static/images/island.png" alt=""/>
			</center>
			<article>
				《我的世界》最大的乐趣之一，就是能在游戏中打造浩大的人类工程，即便是幻想中的建筑也能重现。 
				<br/>
				在缘起大陆的微薄的夜晚，是一切结束之日，那是一个新的纪元。
				<br/>
				挖掘、破坏、跑酷、搜集、潜入!
			</article>
			<button class="btn download-btn">下载客户端</button>
			<div class="content-box clearfix">
				<div class="hover-box">
					<img src="./static/images/home1.jpg" />
					<div class="hover-content">
						<h2>用心</h2>
						<p>经多位OP倾情打造，将心血倾泻予建筑之上。即使我们的建筑不是最宏伟最好看的，但是一个一个堆叠而成的方块代表了每一位玩家的用心。</p>
					</div>
				</div>
				<div class="hover-box">
					<img src="./static/images/out1.jpg" />
					<div class="hover-content">
						<h2>闯关</h2>
						<p>好玩刺激的闯关地图，进服就送超强套装，真正能够实现一刀999的快感。</p>
					</div>
				</div>
				<div class="hover-box">
					<img src="./static/images/warm1.jpg" />
					<div class="hover-content">
						<h2>跑酷</h2>
						<p>专为跑酷玩家打造，紧张惊险的跑酷地图谁不爱呢？</p>
					</div>
				</div>
			</div>
		</div>	
		<jsp:include page="./common/footer.jsp"></jsp:include>
	</div>
</body>
</html>