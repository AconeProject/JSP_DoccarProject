package com.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.admin.action.Action;
import com.admin.action.ActionForward;

public class LogOut implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session =  request.getSession();
		
		session.invalidate();
		
		ActionForward forword = new ActionForward();
		forword.setPath("/Member/LogOut.jsp");
		forword.setRedirect(false);
		return forword;
	}

}
