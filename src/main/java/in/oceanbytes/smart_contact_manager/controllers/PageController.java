package in.oceanbytes.smart_contact_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home Page");
        return "home";
    }

    //about page
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About Page");
        return "about";
    }

    //service page
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services Page");
        return "services";
    }

    //contact page
    @RequestMapping("/contact")
    public String contactPage() {
        System.out.println("Contact Page");
        return "contact";
    }

    //login page
    @RequestMapping("/login")
    public String loginPage() {
        System.out.println("Login Page");
        return "login";
    }

    //register page
    @RequestMapping("/register")
    public String registerPage() {
        System.out.println("Register Page");
        return "register";
    }
}
