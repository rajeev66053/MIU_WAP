package demo1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
	    		int i = Integer.parseInt(request.getParameter("num1"));
	    		int j = Integer.parseInt(request.getParameter("num2"));
	    		
	    		int k=i+j;
	    		int s=k*k;
	    		
	    		response.sendRedirect("sq?s="+s); // URL Rewriting
    	
    		}

}
