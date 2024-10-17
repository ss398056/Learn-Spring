package spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//This class can handler entire project exceptions. It is also known as centerlized exception handler
@ControllerAdvice
public class MyExceptionHandler {
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)					
	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	public String exceptionHandler(Model m, Exception e) {
		m.addAttribute("msg",e.getMessage());
		return "error";	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)					
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m, Exception e) {
		m.addAttribute("msg",e.getMessage());
		return "error";
	}
	
}
