package ru.katechon.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class SiteController {
    @RequestMapping(method = RequestMethod.GET)
    public String printIndex(ModelMap modelMap){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("MyTwitter-context.xml");

        return "index";
    }


}
