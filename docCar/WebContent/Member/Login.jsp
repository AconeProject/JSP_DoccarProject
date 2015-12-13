<%@ include file="../head.jsp"%>
<%@page pageEncoding="utf-8"%>
<div id="LoginBox">
	<h3>
		로그인 <span>- Login</span>
	</h3>
	<form action="/jt_exam/Login_check.bo" method="post">
		<div class="Login">
			<ul>
				<li><input type="text" name="id"></li>
				<li><input type="text" name="pw"></li>
			</ul>
		</div>
		<input type="submit" value="로그인" />
	</form>
</div>
</body>
</html>