package demo3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
	    		int i = Integer.parseInt(request.getParameter("num1"));
	    		int j = Integer.parseInt(request.getParameter("num2"));
	    		
	    		int k=i+j;
	    		
	    		Cookie cookie=new Cookie("k",k + "");
	    		response.addCookie(cookie);
	    		
	    		response.sendRedirect("sq");
    	
    		}


}
