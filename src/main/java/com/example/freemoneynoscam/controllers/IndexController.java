package com.example.freemoneynoscam.controllers;


import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        if(new ValidateEmailService().isEmailValid(dataFromForm.getParameter("email"))){
            System.out.println(dataFromForm.getParameter("email"));
            return "redirect:/done";
        }
        return "redirect:/";
    }

    @GetMapping("/done")
    public String done(){
        return "done";
    }

    @GetMapping("/emails")
    public String emails(){
        return "emails";
    }
}
