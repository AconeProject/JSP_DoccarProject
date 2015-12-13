<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="head_sub.jsp" %>



</head>
<body>
<div id="wrap" >


<div id="mb_login"><h1></h1></div>

<div id="header">

	<% if(mb_id != null){%>
	<div id="login_on">
		<%=mb_id.getId() %>님 로그인 되셧습니다.<br>
		<a href="LogOut.bo"><div>로그아웃</div></a>
	</div>
	<%}else{%>
	<div id="login_off">
			<form action="/jt_exam/Login_check.bo" method="post">
				<ul>
					
					<li class="login_input">
						<input type="text" id="input_id" placeholder="아이디"  name="id" />
						<input type="password" id="input_pw" placeholder="비밀번호" name="pw" />
					</li>
					<li class="login_ok_btn"><input type="submit" value="로그인" /></li>
					<li class="join"><a href="Member_join.bo">회원가입</a>&nbsp;/&nbsp;<a>아이디 저장<input type="checkbox" name="save_ID" /></a></li>
				</ul>
			</form>
	</div>	
	<% } %>
	
	<nav>
		

	</nav>
	
</div>



<!-- <div style="clear:both;"></div> -->