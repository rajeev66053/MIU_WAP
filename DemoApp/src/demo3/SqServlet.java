package demo3;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
		
				int k=0;
				
				Cookie cookies[]=request.getCookies();
				
				for(Cookie c : cookies) {
					if(c.getName().equals("k")) {
						k=Integer.parseInt(c.getValue());
					}
					
				}
				
				k=k*k;
	    		
	    		PrintWriter out=response.getWriter();
	    		out.println("Result is :"+k);
	    		
    		}

}
