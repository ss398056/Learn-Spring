package spring.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.model.Student;

@Controller
public class FormController {
	
	@RequestMapping("/complexform")
	public String complexForm() {
		return "complexform";
	}
	
	
	
	@RequestMapping(path="/handlecomplexform", method= RequestMethod.POST)
	public String complexFormHandler(@ModelAttribute("student") Student student, BindingResult result) {
		
		//Error handling by using BindingResult interface
		if(result.hasErrors()) {
			return "complexform";
		}
		System.out.println(student);
		return "show_data";
	}
	
	//This is method used for date conversion
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	

}
