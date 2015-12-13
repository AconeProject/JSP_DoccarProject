package com.JTexam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Member.LogOut;
import com.Member.Login_check;
import com.Member.MemberList;
import com.Member.memberJoin;


public class JT_Front_Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public JT_Front_Controler() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String command = uri.substring(path.length());
		
		Action ac = null;
		ActionForword forword = null;
		System.out.println(command);
		
		if(command.equals("/Member_join.bo")){
			ac = new memberJoin();
			try {
				forword = ac.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(command.equals("/Login_check.bo")){
			ac = new Login_check();
			try {
				forword = ac.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(command.equals("/Member_List.bo")){
			ac = new MemberList();
			try {
				forword = ac.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(command.equals("/LogOut.bo")){
			ac = new LogOut();
			try {
				forword = ac.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(command.equals("/MemberLogin.bo")){
			forword = new ActionForword();
			forword.setRedirect(false);
			forword.setPath("./Member/Login.jsp");
		}else if(command.equals("/Main.bo")){
			forword = new ActionForword();
			forword.setPath("/");
			forword.setRedirect(false);
		}
		
		if(forword != null){
			if(forword.isRedirect()){
				response.sendRedirect(forword.getPath());
			}else{
				RequestDispatcher dispatcher=
					request.getRequestDispatcher(forword.getPath());
					//RequestDispatcher타입을 반환한다. 
				dispatcher.forward(request, response);
					//forward라는 메소드를 이용할려고한다.
					//입력값으로 request,response를 전달할려고한다.
			}
		}
		
		
	}

}
