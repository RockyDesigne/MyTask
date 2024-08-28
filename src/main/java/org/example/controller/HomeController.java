package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) { //model can be used to pass data to the view(the htmpl page)
        model.addAttribute("message", "Hello from Spring!");
        return "home";
    }
}
