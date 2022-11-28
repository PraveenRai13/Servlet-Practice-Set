package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Test() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		System.out.println("Session created. Listener will be invoked");
		session.setAttribute("username", "Praveen");
		session.setAttribute("password", "prav123");
		System.out.println("Session attributes displayed. Listener to come here");
		session.setAttribute("username", "Pranav");
		System.out.println("attributes modified. Listener will be invoked");
		session.invalidate();
		System.out.println("Session destroyed");
	}

}
