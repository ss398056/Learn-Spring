package spring.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.model.User;
import spring.mvc.services.UserService;


@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/contact")
	public String showform(Model model) {
		model.addAttribute("Heading", "Contact Form");
		
		return "contact";
	}
	
	//This method is using @ModelAttribute() annotation
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		//model.addAttribute("user", user);			//It's not required it automatically set all the User values in Model
		if(user.getName().isBlank()) {
			return "redirect:contact";
		}
		model.addAttribute("success", "Form submitted successfully");
		this.userService.sendSimpleEmail(user.getEmail(), "New Quary", user.getMessage());
		this.userService.createuser(user);
		return "success";
	}
	
	
//	//This method is using @RequestParam() annotation
//		@RequestMapping(path="/processform", method=RequestMethod.POST)
//		public String handleForm(@RequestParam("email") String email,@RequestParam("name") String name, @RequestParam("mobile") String mobile, @RequestParam("message") String message, Model m) {
//			
//			//submit data by attribute name
//			/*m.addAttribute("name", name);
//			m.addAttribute("email", email);
//			m.addAttribute("mobile", Long.parseLong(mobile));
//			m.addAttribute("message", message);
//			*/
//			
//			//submit data by object of User class
//			User user = new User( name, email, message, Long.parseLong(mobile));
//			m.addAttribute(user);
//			
//			
//			return "success";
//		}
	

	
}
