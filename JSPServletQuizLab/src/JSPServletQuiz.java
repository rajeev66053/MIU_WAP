

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class JSPServletQuiz
 */
@WebServlet("/JSPServletQuiz")
public class JSPServletQuiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSPServletQuiz() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
    	 Quiz q = new Quiz();
		 q.setQuestion(q.firstQuestion());
		 HttpSession session = request.getSession();
		 session.setAttribute("Quiz", q);
		 session.removeAttribute("Age");
		 session.removeAttribute("AgeError");
		 session.removeAttribute("TryAgain");
		 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("quiz.jsp");
		 rd.forward(request, response);
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		 Quiz q = (Quiz)session.getAttribute("Quiz");
		 String answer = request.getParameter("answer");
		 String ageStr = request.getParameter("age");
		// session.removeAttribute("Age");
		 
		 
			 int age;
			 try {
				 age = Integer.parseInt(ageStr);
				 if(age < 4 || age > 100) {
					 session.setAttribute("AgeError", "Age invalid. Age must be between 4 and 100.");
					 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("quiz.jsp");
					 rd.forward(request, response);
					 return;
				 }
				 session.removeAttribute("AgeError");
				 q.setAge(age);
				 session.setAttribute("Age", age);
			 }catch(Exception ex) {
				 session.setAttribute("AgeError", "Age is required.");
				 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("quiz.jsp");
				 rd.forward(request, response);
				 return;
			 }

		 session.removeAttribute("TryAgain");
		 
		 if(!answer.isEmpty()) {
			 boolean result = q.checkAnswer(answer);
			 if((!result && q.getTimeOfTry() > 3) || result)
				 q.setQuestion(q.nextQuestion());
			 else
				 session.setAttribute("TryAgain", String.format("Attempt %d/%d",q.getTimeOfTry(),3));	 
			 session.setAttribute("Quiz", q);
			
			 if(!q.finished()) {
				 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("quiz.jsp");
				 rd.forward(request, response);
			 } else {
				 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("complete.jsp");
				 rd.forward(request, response);
			 }
		 }else {
			 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("quiz.jsp");
			 rd.forward(request, response);
		 }
	}

}
