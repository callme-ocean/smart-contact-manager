package in.oceanbytes.smart_contact_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home() {
        System.out.println("Home Page");
        return "home";
    }

    //about page
    @GetMapping("/about")
    public String aboutPage() {
        System.out.println("About Page");
        return "about";
    }

    //service page
    @GetMapping("/services")
    public String servicesPage() {
        System.out.println("Services Page");
        return "services";
    }

    //contact page
    @GetMapping("/contact")
    public String contactPage() {
        System.out.println("Contact Page");
        return "contact";
    }

    //login page
    @GetMapping("/login")
    public String loginPage() {
        System.out.println("Login Page");
        return "login";
    }

    //register page
    @GetMapping("/register")
    public String registerPage() {
        System.out.println("Register Page");
        return "register";
    }
}
