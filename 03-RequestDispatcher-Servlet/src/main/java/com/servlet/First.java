package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class First extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String em=req.getParameter("em");
		String pswd=req.getParameter("pswd");
		RequestDispatcher rd;
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		if("demo@gmail.com".equals(em) && "demo".equals(pswd))
				{
					rd=req.getRequestDispatcher("/servlet2");
					rd.forward(req, resp);
				}
		else
		{
			out.print("<h1>username or password incorrect</h1>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
 	}
		
}
