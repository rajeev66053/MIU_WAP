import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException{
		
		//JSTL ->JSP standard Tag library
		
		 String name="Rajeev";		
			
		  request.setAttribute("label", name);
		  
		  List<Student> studs=Arrays.asList(new Student(1,"Rajeev"),new Student(2,"Mohan"),new Student(3,"Arjun"));
		
		  Student s=new Student(1,"Rajeev");		
		
		  request.setAttribute("student", s);
		  

		  request.setAttribute("students", studs);
		  RequestDispatcher rd= request.getRequestDispatcher("display.jsp");
		  rd.forward(request, response);
		
		
	}

}
