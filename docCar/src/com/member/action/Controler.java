package com.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Controler() {
        super();
    }
    
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String RequestURI=request.getRequestURI();
		   String contextPath=request.getContextPath();
		   String command=RequestURI.substring(contextPath.length());
		   
		   System.out.println(command+"member 회원관련 서블릿");
		   ActionForward forward=null;
		   Action action=null;
    	
		   
		   if(command.equals("/car_join.me")){
			   forward = new ActionForward();
			   forward.setRedirect(true);
			   forward.setPath("/Member/car_join.jsp");
		   }else if(command.equals("/car_joinOk.me")){
			   action = new CarJoinAction();
			   try {
				action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
		   }
    	
    	
    };
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

}
