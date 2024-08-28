package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubmitController {
    @PostMapping("/submit")
    public String handleSubmit(@RequestParam String inputField, Model model) {
        model.addAttribute("message", "You submitted: " + inputField);
        return "home";
    }
}
