package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondProgram extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("generic servlet is running ");	
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("Date: "+new Date().toString());
		
	}
	
}
