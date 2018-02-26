package AP.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class web {
    @RequestMapping("/")
	String showIndex() {
		return "index";
	}
        
    @RequestMapping("/home")
	String showHome() {
		return "index";
	}    
        
    @RequestMapping("/about")
	String showAbout() {
		return "about";
	}
        
    @RequestMapping("/services")
	String showServices() {
		return "services";
	}    
      
    @RequestMapping("/project")
	String showProject() {
		return "project";
	}  
        
    @RequestMapping("/contacts")
	String showContacts() {
		return "contacts";
	}    
}
