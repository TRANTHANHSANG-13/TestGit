package com.example.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testGit {
    @RequestMapping("/hello")
    public String test(){
        return "index";
    }
}
