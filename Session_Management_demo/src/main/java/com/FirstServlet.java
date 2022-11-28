package com;

import java.io.IOException;
import dto.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public FirstServlet() {
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u =new User();
		HttpSession session = request.getSession();
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		session.setAttribute("user", u);
		response.sendRedirect("two.html");
	}

}
