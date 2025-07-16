package com.example.simpleecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simpleecommerceapp.entity.Message;
import com.example.simpleecommerceapp.service.ContactService;

import jakarta.validation.Valid;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    // Handles contact form submission
    @PostMapping("/send/message")
    public String sendMessage(@Valid @ModelAttribute("message") Message message,
                              BindingResult result,
                              Model model) {

        if (result.hasErrors()) {
            model.addAttribute("error", "❌ Please correct the errors and try again.");
            return "ContactUs";
        }

        contactService.createMessage(message);
        model.addAttribute("confirmation", "✅ Your message has been successfully sent!");
        model.addAttribute("message", new Message()); // Clear the form after success

        return "ContactUs"; // Must match ContactUs.html in templates folder
    }
}
