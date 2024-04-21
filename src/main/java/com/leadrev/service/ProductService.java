package com.leadrev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadrev.entity.Product;
import com.leadrev.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findAll(pageable);
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
    
    public Page<Product> getAllProducts(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return productRepository.findAll(pageable);
    }

    public List<Product> getProductsByName(String name) {
        return productRepository.findByNameIgnoreCaseContaining(name);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoriesContainingIgnoreCase(category);
    }

    public List<Product> getProductsByAttribute(String key, String value) {
        return productRepository.findByAttributesKeyAndAttributesValueIgnoreCase(key, value);
    }


}
