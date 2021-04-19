import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse
		 response)throws ServletException, IOException
	  {
		/*At first request goes to filter and chain all the filter process.
		If all the filter process success then only request comes here.
		 In this example first Idfilter is executeted and then name filter
		  is executed and then request come to servlet. Every filter must have same web servlet route.*/ 
	PrintWriter out=response.getWriter();

	int aid=Integer.parseInt(request.getParameter("aid"));
	String aname=request.getParameter("aname");
	out.println("Welcome "+ aname);
	
	  }

}
