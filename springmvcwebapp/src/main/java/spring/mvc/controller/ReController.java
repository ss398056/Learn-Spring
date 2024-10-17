package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/success")
	public RedirectView success() {			//Redirect using RedirectView object
		RedirectView rw = new RedirectView();
		rw.setUrl("error");
		return rw;
	}
	
	@RequestMapping("/error")
	public String error() {
		return "redirect:about";			//Retirect using redirect prefix
	}

}
