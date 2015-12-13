<%@ include file="head.jsp" %>
<%@ page  pageEncoding="UTF-8"%>
<%@page import = "com.Member.Login" %>
<div id="indexBox">

	<h1>Class of Heaven</h1>
	<ul id="contents">
		<% if(mb_id == null){ %>
		<a href="MemberLogin.bo"><li class="login_off">로그인</li></a>
		<a href="Member/MemberJoin.jsp"><li class="login_off">회원가입</li></a>
		<%}else{ %>
		<a href="Member_List.bo"><li  class="login_on">회원리스트</li></a>
		<%} %>
		<div style="clear:both;"></div>
	</ul>
</div>


 </div>
</body>
</html>