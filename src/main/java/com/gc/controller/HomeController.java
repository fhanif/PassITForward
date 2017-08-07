package com.gc.controller;

/**
 * Created by fhani on 7/21/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/create-profile")
    //the String method returns the jsp page that we want to show
    public String registration() {
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
