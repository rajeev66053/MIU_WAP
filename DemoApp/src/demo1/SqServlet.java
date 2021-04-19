package demo1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
		
		  int s= Integer.parseInt(request.getParameter("s"));
		 
		  PrintWriter out=response.getWriter(); out.println("Result is :"+s);
		 
	    		
    		
    	
    		}

}
