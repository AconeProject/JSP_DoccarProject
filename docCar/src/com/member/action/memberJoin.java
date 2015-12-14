package com.member.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.action.Action;
import com.admin.action.ActionForward;
import com.member.db.BoardDAO;

public class memberJoin implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		BoardDAO dao = new BoardDAO();
		Member member = new Member();
		
		
		
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("pw"));
		member.setName(request.getParameter("name"));
		member.setAddress(request.getParameter("address"));
		member.setEmail(request.getParameter("email"));
		
		Cookie cookie = new Cookie("saveID", request.getParameter("save_ID"));
		cookie.setMaxAge(60*60*60*24);
		response.addCookie(cookie);
		
		
		dao.Member_Join(member);
		
		ActionForward forword = new ActionForward();
		forword.setPath("Member/MemberJoin.jsp");
		forword.setRedirect(false);
		return forword;
	}

}
