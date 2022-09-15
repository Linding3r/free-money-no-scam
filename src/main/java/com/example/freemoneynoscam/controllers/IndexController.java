package com.example.freemoneynoscam.controllers;


import com.example.freemoneynoscam.repository.Repository;
import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {
    private Repository rep = new Repository();

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @PostMapping("/test")
    public String test(@RequestParam("email") String email, RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("email", email);
        rep.addToList(email);
        return "redirect:/test";
    }

    @GetMapping("/test")
    public String done(@RequestParam("email") String email, Model model){
        model.addAttribute("email", email);
        return "done";
    }

    @GetMapping("/emails")
    public String emails(Model model){
        model.addAttribute("emails", rep.toString());
        return "emails";
    }
}
