package com.example.simpleecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.simpleecommerceapp.entity.Admin;
import com.example.simpleecommerceapp.entity.Message;
import com.example.simpleecommerceapp.service.ProductService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    // ✅ Landing page for "/" and "/home"
    @GetMapping({"/", "/home"})
    public String homePage() {
        return "HomePage"; // Make sure HomePage.html exists in /templates
    }

    // ✅ Products page - shows all products
    @GetMapping("/products")
    public String productPage(Model model) {
        model.addAttribute("productList", productService.getAllProduct());
        return "Products"; // Make sure Products.html exists in /templates
    }

    // ✅ Contact Us page with empty Message object
    @GetMapping("/contactUs")
    public String contactPage(Model model) {
        model.addAttribute("message", new Message());
        return "ContactUs"; // Make sure ContactUs.html exists
    }

    // ✅ About Us page
    @GetMapping("/aboutUs")
    public String aboutUs() {
        return "AboutUs"; // Make sure AboutUs.html exists
    }

    // ✅ Login page with empty Admin object
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("admin", new Admin());
        return "LoginPage"; // Make sure LoginPage.html exists
    }
}
