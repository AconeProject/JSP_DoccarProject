package com.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JTexam.Action;
import com.JTexam.ActionForword;

public class LogOut implements Action{

	@Override
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session =  request.getSession();
		
		session.invalidate();
		
		ActionForword forword = new ActionForword();
		forword.setPath("/Member/LogOut.jsp");
		forword.setRedirect(false);
		return forword;
	}

}
