package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello")
public class Nana02 extends HttpServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String cnt_temp = request.getParameter("cnt");
		int cnt = 100;
		
		if(cnt_temp != null && !cnt_temp.equals("")) {
			cnt = Integer.parseInt(cnt_temp);
		}
			
		for (int i = 0; i < cnt; i++) {
			out.println((i + 1) + ": 안녕 Servlet!!<br>");
		}
	}
}
