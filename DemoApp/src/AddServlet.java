import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
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
	    		
				
			  request.setAttribute("s", s);
			  RequestDispatcher rd= request.getRequestDispatcher("sq");
			  rd.forward(request, response);
    	
    		}

}
