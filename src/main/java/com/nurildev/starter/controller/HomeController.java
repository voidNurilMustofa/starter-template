package com.nurildev.starter.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
//@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    public String home(Principal principal, Model model){
        model.addAttribute("userLogin", principal.getName());
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
