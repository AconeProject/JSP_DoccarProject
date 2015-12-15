<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="head_sub.jsp" %>
<link href="<%=request.getContextPath()%>/css/index.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/menu.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/index.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
</head>
<body>
<div id="wrap">
<div id="head">
	<h1><a href="<%=request.getContextPath()%>"><img alt="" src="<%=request.getContextPath()%>/img/logo.png"></a></h1>
	<nav>
		<ul>
			<a href="#"><li class="menu1">접수하기</li></a>
			<a href="#"><li class="menu2">공업사찾기</li></a>
			<a href="#"><li class="menu3">Befor&amp;After</li></a>
			<a href="#"><li class="menu4">커뮤니티</li></a>
		</ul>
		
		<%-- <div class="main_banner01">
			<a href="<%=request.getContextPath()%>/car_join.me"><img src="<%=request.getContextPath()%>/img/main_banner01.png" alt="무료제휴 가입신청"></a>
		</div> --%>
	</nav>
</div>