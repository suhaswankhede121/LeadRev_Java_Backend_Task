package com.leadrev.repository;

import java.util.List;

import com.leadrev.entity.Product;

public interface CustomProductRepository {
    List<Product> findByAttributesKeyAndAttributesValueIgnoreCase(String key, String value);
}
 	