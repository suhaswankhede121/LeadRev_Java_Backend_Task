package com.leadrev.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Document(collection = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id; 	
    private String name;
    private String description;
    private double price;
    private List<String> categories;
    private List<Map<String, String>> attributes;
    private Availability availability;
    private List<Rating> ratings;

}

