package com.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s2
 */

public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
	    out.print("Servlet s2");
	    String n1 = request.getParameter("n1");
	    String n2 = request.getParameter("n2");
	    int nn1 = Integer.parseInt(n1);
	    int nn2 = Integer.parseInt(n2);
	    int p =  nn1 * nn2;
	    //get attribute from s1
	    int s  = (int) request.getAttribute("sum");
	    out.print("Sum is = "+ s);
	    out.print("<br>Product is = "+ p);
	    	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
