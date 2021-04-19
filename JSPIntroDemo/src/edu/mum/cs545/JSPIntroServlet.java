package edu.mum.cs545;
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/JSPIntroServlet")
public class JSPIntroServlet extends HttpServlet
{
 protected void doGet(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException
 {
 RequestDispatcher dispatcher = request.getRequestDispatcher("Hello.jsp");
 dispatcher.forward(request, response);
 }

 protected void doPost(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException
 {
 RequestDispatcher dispatcher =
request.getRequestDispatcher("PostMessage.jsp");
 dispatcher.forward(request, response);
 }
}
