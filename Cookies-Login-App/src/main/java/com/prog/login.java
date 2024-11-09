package com.prog;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class login extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//getting parameter value
		String email=req.getParameter("em");
		String password=req.getParameter("pswd");
		//creating cookies
		Cookie ck=new Cookie("em",email);
		Cookie ck2=new Cookie("pswd",password);
		//adding cookies
		resp.addCookie(ck);
		resp.addCookie(ck2);
		
		resp.sendRedirect("profile");
		
		
		
	}
	

}
