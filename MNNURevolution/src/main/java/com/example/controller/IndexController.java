package com.example.controller;

import com.example.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String index(String name, String id, String academy, Model model){
        model.addAttribute("user", new User(name, id, academy));
        return "index";
    }
}
