package com.member.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.action.Action;
import com.admin.action.ActionForward;
import com.member.db.BoardDAO;

public class MemberList implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		BoardDAO dao = new BoardDAO();
		
		
		ArrayList<Member> list = null;
		list = dao.selectMember();

		

		
		
		request.setAttribute("list", list);
		
		
		ActionForward forword = new ActionForward();
		forword.setPath("Member/MemberList.jsp");
		forword.setRedirect(false);
		return forword;
	}

}
