package com.cookieinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Displaycookie")
public class Displaycookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		Cookie cookies[]=request.getCookies();
	if(cookies !=null) {
		for(Cookie c: cookies) {
			String uname=c.getValue();
			if(uname!=null || uname.equals("")==false) {
				out.println("Welcome user::"+uname);
	}

}
	}
	}}
