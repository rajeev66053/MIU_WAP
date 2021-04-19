package demo2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
	    		int i = Integer.parseInt(request.getParameter("num1"));
	    		int j = Integer.parseInt(request.getParameter("num2"));
	    		
	    		int k=i+j;
	    		int s=k*k;
	    		
	    		HttpSession session=request.getSession();
	    		session.setAttribute("s", s);
	    		
	    		response.sendRedirect("sq");
    	
    		}

}

