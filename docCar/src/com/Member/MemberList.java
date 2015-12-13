package com.Member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BoardDB.BoardDAO;
import com.JTexam.Action;
import com.JTexam.ActionForword;

public class MemberList implements Action{

	@Override
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		BoardDAO dao = new BoardDAO();
		
		
		ArrayList<Member> list = null;
		list = dao.selectMember();

		

		
		
		request.setAttribute("list", list);
		
		
		ActionForword forword = new ActionForword();
		forword.setPath("Member/MemberList.jsp");
		forword.setRedirect(false);
		return forword;
	}

}
