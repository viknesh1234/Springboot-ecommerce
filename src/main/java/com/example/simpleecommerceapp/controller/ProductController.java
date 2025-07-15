package com.example.simpleecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.simpleecommerceapp.entity.Product;
import com.example.simpleecommerceapp.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    // Add a new product
    @PostMapping("/add/product")
    public String addProduct(@ModelAttribute Product product) {
        productService.createProduct(product);
        return "redirect:/admin/home";
    }

    // Show update form with existing product data
    @GetMapping("/update/product/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Product existingProduct = productService.getProductById(id);
        model.addAttribute("product", existingProduct);
        return "UpdateProduct"; // Make sure UpdateProduct.html exists in templates
    }

    // Handle product update form submission
    @PostMapping("/update/product")
    public String updateProduct(@ModelAttribute Product product) {
        productService.updateProduct(product);
        return "redirect:/admin/home";
    }

    // Delete product by ID
    @GetMapping("/delete/product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/admin/home";
    }
}
