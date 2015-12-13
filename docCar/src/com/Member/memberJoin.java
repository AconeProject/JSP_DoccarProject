package com.Member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BoardDB.BoardDAO;
import com.JTexam.Action;
import com.JTexam.ActionForword;

public class memberJoin implements Action{

	@Override
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
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
		
		ActionForword forword = new ActionForword();
		forword.setPath("Member/MemberJoin.jsp");
		forword.setRedirect(false);
		return forword;
	}

}
