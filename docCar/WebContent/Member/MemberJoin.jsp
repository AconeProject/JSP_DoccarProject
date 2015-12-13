<%@ include file="../head.jsp" %>
<%@ page pageEncoding="utf-8" %>
<%@ page trimDirectiveWhitespaces="true" %>


<div id="Box">
	<div id="mainBox">
		<div id="tableBox">
		<h2>회원가입<span> - join</span></h2>
		<form action="../Member_join.bo" method="post" >
			<table border="0" >
				<colgroup>
					<col width="25%">
					<col width="*">
				</colgroup>
				<tbody>
					<tr>
						<th class="table_top">아이디</th>
						<td class="table_top" id="overlap_td">
							<input type="text" name="id" value="" />
							<span id="overlap">중복확인</span>
						</td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password"  id="pw_check1" name="pw" ></td>
					</tr>
					<tr>
						<th>비밀번호 확인</th>
						<td id="pw2"><input type="password" id="pw_check2" ></td>
					</tr>
					<tr>
						<th>이름</th>
						<td>
								<input type="text"  name="name" >
						</td>
					</tr>
					<tr>
						<th>주소</th>
						<td><input type="text" name="address" /></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td>
						<input type="text" name="email">
						</td>
					</tr>
				</tbody>
			</table>
			<!-- <p class="check_btn">개인정보취급동의 <input type="checkbox" id="privercy_ok" required="required"></p> -->
			<div class="join_btn"><input type="submit" value="가입신청"></div>
			
			</form>
		</div>
	</div>
</div>

</body>
</html>