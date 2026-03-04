package com.codes.webApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

//    @ResponseBody
    @RequestMapping("/")
    public String greet() {
        return "Hello, Welcome to spring boot application!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is a simple Spring Boot application.";
    }
}
