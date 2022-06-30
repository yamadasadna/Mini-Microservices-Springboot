package com.yamadasadna.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.yamadasadna.productservice.dto.ProductRequest;
import com.yamadasadna.productservice.dto.ProductResponse;
import com.yamadasadna.productservice.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    // endpoint untuk membuat product
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    // endpoint untuk menampilkan seluruh data product
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllPorducts(){
        return productService.getAllProducts();
    }
}