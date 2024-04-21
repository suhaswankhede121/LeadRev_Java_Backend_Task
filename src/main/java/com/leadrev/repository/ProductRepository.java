package com.leadrev.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leadrev.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	List<Product> findByNameIgnoreCaseContaining(String name);
	List<Product> findByCategoriesContainingIgnoreCase(String category);
	List<Product> findByAttributesKeyAndAttributesValueIgnoreCase(String key, String value);

}

