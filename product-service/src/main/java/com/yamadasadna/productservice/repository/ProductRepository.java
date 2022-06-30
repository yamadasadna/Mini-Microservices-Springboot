package com.yamadasadna.productservice.repository;

import com.yamadasadna.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
