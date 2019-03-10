package com.web.demo.controller;

import com.web.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello, This is Spring Boot";
    }

    @RequestMapping("/api")
    @ResponseBody
    public String api(){
        return "This is API result!";
    }

    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute("list",userService.select());
        return "user";
    }
}
