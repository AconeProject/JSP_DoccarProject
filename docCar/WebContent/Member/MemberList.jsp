<%@ include file="../head.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="utf-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@page import = "java.util.ArrayList" %>
<%@page import = "com.Member.Member" %>
<div id="list_box">
	<h3>Member Info</h3>
	<table border="0" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>주소</th>
				<th>이메일</th>
				<th>가입일</th>
			</tr>
		</thead>		
		<tbody>
		<c:forEach var="i" items="${list}" begin="0" end="${list.size()}">
			<tr>
				<td>${i.getId()}</td>
				<td>${i.getName()}</td>
				<td>${i.getAddress()}</td>
				<td>${i.getEmail()}</td>
				<td>${i.getRegisterDate()}</td>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
</div>
</body>
</html>