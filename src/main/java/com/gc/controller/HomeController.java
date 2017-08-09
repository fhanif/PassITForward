package com.gc.controller;

/**
 * Created by fhani on 7/21/2017.
 */


import com.gc.com.model.test.UsersEntity;
import com.test.models.UsersEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/create-profile")
    //the String method returns the jsp page that we want to show
    public String registration(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               @RequestParam("password") String password,
                               @RequestParam("email") String email,
                               Model model) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session session = sessionFact.openSession();
        Transaction tx = session.beginTransaction();
        UsersEntity newUser = new UsersEntity();

        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setPassword(password);
        newUser.setEmail(email);

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("password", password);
        model.addAttribute("email", email);


        return "registrationsucess";
    }

    @RequestMapping("/registration")
    //the String method returns the jsp page that we want to show
    public String registration(){

        return "registration";
    }

    @RequestMapping("/projectselect")
    //the String method returns the jsp page that we want to show
    public String projectselect() {
        return "projectselect";
    }

    @RequestMapping("/languages-select")
    //the String method returns the jsp page that we want to show
    public String languageselect() {
        return "languageselect";
    }
}
