package com.baeldung.spring.web.thymeleaffragments.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.baeldung.spring.web.thymeleaffragments.domain.Friend;

@Controller
public class FragmentsController {
    @GetMapping("/")
    public String registerPage() {
        return "index";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
    
    @GetMapping("/markup")
    public String markupPage() {
        return "markup";
    }
    
    @GetMapping("/params")
    public String paramsPage() {
        return "params";
    }

    @GetMapping("/other")
    public String otherPage(Model model) {
        List<Friend> data = new ArrayList<Friend>();
        data.add(new Friend(1L, "John Doe"));
        data.add(new Friend(2L, "Guy Incognito"));
        
        model.addAttribute("data", data);
        return "other";
    }

}