import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
	    		int s= (int) request.getAttribute("s");
	    		
	    		PrintWriter out=response.getWriter();
	    		out.println("Result is :"+s);
	    		
    		}

}
