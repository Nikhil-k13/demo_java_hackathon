package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // Displays the initial blank page
    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    // Handles form submission from the browser
    @PostMapping("/submit")
    public String handleFormSubmit(@RequestParam("userName") String userName, Model model) {
        // Pass the submitted value to the Thymeleaf template
        model.addAttribute("submittedName", userName);
        return "index";
    }
}