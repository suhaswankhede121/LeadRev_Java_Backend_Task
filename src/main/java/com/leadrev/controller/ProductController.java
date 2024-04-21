package com.leadrev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.leadrev.entity.Product;
import com.leadrev.entity.Rating;
import com.leadrev.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Page<Product> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return productService.getAllProducts(page, size);
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
    
    @PutMapping("/{id}/rate")
    public Product rateProduct(@PathVariable String id, @RequestBody Rating rating) {
        Optional<Product> optionalProduct = productService.getProductById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.getRatings().add(rating);
            return productService.updateProduct(id, product);
        }
        return null;
    }
    
    @GetMapping("/search")
    public List<Product> searchProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String attribute) {
        if (name != null) {
            return productService.getProductsByName(name);
        } else if (category != null) {
            return productService.getProductsByCategory(category);
        } else if (attribute != null) {
            String[] parts = attribute.split(":");
            if (parts.length == 2) {
                String key = parts[0];
                String value = parts[1];
                return productService.getProductsByAttribute(key, value);
            }
        }
        return new ArrayList<>();
    }


}
