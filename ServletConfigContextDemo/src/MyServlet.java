import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException {
		
		PrintWriter out=response.getWriter();
		out.println("Hi");
		
		//get data from web.xml from context-param (Servlet Context) Value is used for all the servlet in the project
		ServletContext ctx=getServletContext();
		String name=ctx.getInitParameter("name");
		out.println("My name is " +name);
		
		ServletContext ctx1=getServletContext();
		String phone=ctx.getInitParameter("phone");
		out.println("I am using " +phone+ " phone");
		
		
		//get data from web.xml init-param (servlet config).Value is different for each Servlet
		ServletConfig cg=getServletConfig();
		String course=cg.getInitParameter("course");
		out.println("My current course is " +course);
	}

}
