package com.leadrev.service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.leadrev.entity.Product;
import com.leadrev.repository.CustomProductRepository;

@Repository
public class ProductRepositoryImpl implements CustomProductRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Product> findByAttributesKeyAndAttributesValueIgnoreCase(String key, String value) {
        return mongoTemplate.find(query(where("attributes").elemMatch(where("key").is(key).and("value").regex(value, "i"))), Product.class);
    }
}

