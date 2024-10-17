package spring.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class MyInterceptor implements  HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is pre handler");
		String name = request.getParameter("name");
		if(name.startsWith("s") || name.startsWith("S")) {
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid name should not starts with 's' or 'S' </h1>");
			return false;
		}
		return true;
	}
		
	
}
