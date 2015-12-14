package com.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.admin.action.Action;
import com.admin.action.ActionForward;
import com.member.db.BoardDAO;

public class Login_check implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDAO dao = new BoardDAO();
		Login login = new Login();
		
		login.setId(request.getParameter("id"));
		login.setPassword(request.getParameter("pw"));
		
		Login login_ok = dao.Login_ck(login);
		ActionForward forword = new ActionForward();
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter  out = response.getWriter();

		
		if(login_ok.isLogin_check()){
			HttpSession session = request.getSession();
			session.setAttribute("login_ok", login_ok);
			 out.println("<script>alert('로그인 되셧습니다.')</script>");
			 out.println("<script>"+"location.href='"+request.getContextPath()+"/Main.bo';"+"</script>");
			 out.close();
		}else{
			request.setAttribute("login_ok", "1");
		}
		
		forword.setRedirect(false);
		forword.setPath("Main.bo");
		return forword;
	}

}
