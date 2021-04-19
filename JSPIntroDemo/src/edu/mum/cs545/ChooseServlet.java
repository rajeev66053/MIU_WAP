package edu.mum.cs545;
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ChooseServlet")
public class ChooseServlet extends HttpServlet
{

 protected void doGet(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException
 {
		
		
		  HttpSession session = request.getSession(false); if (session != null) {
		  session.invalidate(); }
		 
		 
	 
	 RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
	 dispatch.forward(request, response);
 }

 protected void doPost(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException
 {
 String radioJSPCoolChoice = request.getParameter("radioJSPCool"); 

 String JSFwayCoolChoice = request.getParameter("JSFwayCool"); 

 String moonCheeseChoice = request.getParameter("moonCheese");
 
 HttpSession session=request.getSession();
 

 
	 if (radioJSPCoolChoice != null) {

		 session.setAttribute("radioJSPCool", radioJSPCoolChoice);
		 System.out.println ("radioJSPCool choice= "+ radioJSPCoolChoice);
	 }else {
		 System.out.println("No radioJSPCool choice made");
	 }
	 
	 if (JSFwayCoolChoice != null) {

		 session.setAttribute("JSFwayCool", JSFwayCoolChoice);
		 System.out.println ("JSFwayCool choice= "+ JSFwayCoolChoice);
	 }else {
		 System.out.println("No JSFwayCool choice made");
	 }
	 
	 if (moonCheeseChoice != null) {

		 session.setAttribute("moonCheese", moonCheeseChoice);
		 System.out.println ("moonCheese choice= "+ moonCheeseChoice);
	 }else {
		 System.out.println("No moonCheese choice made");
	 }
	 
	 
	 RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
	 dispatch.forward(request, response);
	 
 }
}