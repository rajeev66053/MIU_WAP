package com.miu.controller;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.miu.model.Student;

import java.io.*;
@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet
{
	static final long serialVersionUID = 0;
	public void doGet(HttpServletRequest request, HttpServletResponse
			response)
					throws IOException, ServletException
	{
		
		
		Student[] table = new Student[]
				{
						new Student("bob", 23),
						new Student("jill", 33),
						new Student("kim", 18)
				};
		request.setAttribute("students", table);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("table.jsp");
		dispatcher.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws IOException, ServletException
	{
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("table.jsp");
		dispatcher.forward(request, response);
	}
}
