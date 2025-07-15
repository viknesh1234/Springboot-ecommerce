package com.example.simpleecommerceapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleecommerceapp.entity.Product;
import com.example.simpleecommerceapp.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    // Get all products
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    // Get product by ID
    public Product getProductById(Long id) {
        return productRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Product with id " + id + " not found"));
    }

    // Create new product
    public void createProduct(Product product) {
        productRepo.save(product);
    }

    // Update existing product
    public void updateProduct(Product product) {
        // Ensure the product exists before updating
        if (!productRepo.existsById(product.getId())) {
            throw new RuntimeException("Product with id " + product.getId() + " not found");
        }
        productRepo.save(product);
    }

    // Delete product by ID
    public void deleteProduct(Long id) {
        if (!productRepo.existsById(id)) {
            throw new RuntimeException("Product with id " + id + " not found");
        }
        productRepo.deleteById(id);
    }

    // Find product by name
    public Product findProductByName(String name) {
        return productRepo.findByName(name);
    }
}
