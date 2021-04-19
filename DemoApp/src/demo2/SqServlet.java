package demo2;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
		
				HttpSession session=request.getSession();
				
//				session.removeAttribute("s"); //To remove the session
				
				int s= (int) session.getAttribute("s");
	    		
	    		PrintWriter out=response.getWriter();
	    		out.println("Result is :"+s);
	    		
    		}

}
