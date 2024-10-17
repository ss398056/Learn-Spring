package spring.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.mvc.dao.UserDao;
import spring.mvc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	@Autowired
    private JavaMailSender emailSender;
	
	@Transactional
	public int createuser(User user) {
		return this.dao.saveUser(user);
	}
	
	public void sendSimpleEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        message.setFrom("sandeepproject76@gmail.com"); // Use your email address

        emailSender.send(message);
    }
}
