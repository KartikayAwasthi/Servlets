package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//taking name form index.html file
		String name=req.getParameter("nm");
		//setting response type
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		out.print("<h1>name:"+name+"</h1>");
		out.print("<a href='servlet2?username="+name+"'>servlet2</a>");
		
	}
	
}
