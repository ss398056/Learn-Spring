package spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	//Request using Model
	@RequestMapping(path={"/home","/"}, method = RequestMethod.GET)			//This is use for set url access
	public String home(Model model) {
		//set data in model
		model.addAttribute("name","Karan");
		model.addAttribute("id",324653);
		
		List<String> list = new ArrayList<String>();
		list.add("Kishan");
		list.add("Rohit");
		list.add("Virat");
		model.addAttribute("friends",list);
		
		return "home";		//This is view name or jsp file name
	}
	
	//Simple request
	@RequestMapping("/about")
	public String about() {
		
		//This is checking exception handling
		String str = null;
		str.length();
		
		return "about";
	}
	
	//Request using ModelAndView
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mv = new ModelAndView();
		
		//set data in model
		mv.addObject("name", "Sandeep");
		LocalDateTime now = LocalDateTime.now();
		mv.addObject("now",now);
		//set view
		mv.setViewName("help");
		return mv;
	}
	
	
	//PathVariable annoatation use url binding
	@RequestMapping("/user/{userid}")
	public String getUserDetails(@PathVariable("userid") int userId) {
		System.out.println(userId);

		return "";
	}
	
	//Note : These exception handler only work on single controller
	//This method can call automatically when exception occur
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)					//It sents server status code
//	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//	public String exceptionHandler(Model m, Exception e) {
//		m.addAttribute("msg",e.getMessage());
//		return "error";	}
//	
//	//It can handle all types of exceptions
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)					//It sents server status code
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerGeneric(Model m, Exception e) {
//		m.addAttribute("msg",e.getMessage());
//		return "error";
//	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/welcomeform")
	public String handleWelcome(@RequestParam("name") String name, Model m) {
		m.addAttribute("name",name);
		System.out.println(name);
		return "welcome_data";
	}
}
