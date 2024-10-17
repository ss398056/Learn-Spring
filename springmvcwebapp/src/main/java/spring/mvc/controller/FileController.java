package spring.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

@Controller
public class FileController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "file_form";
	}
	
	@RequestMapping(path="/fileupload", method=RequestMethod.POST)
	public String fileUpload(@RequestParam("image") MultipartFile file, HttpSession s, Model m) {
	
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		System.out.println(file.getClass());
		
		byte[] data;
		try {
			data = file.getBytes();
			String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
			System.out.println(path);
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			m.addAttribute("filename",file.getOriginalFilename());
			m.addAttribute("msg","File uploaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "file_data";
	}
}
