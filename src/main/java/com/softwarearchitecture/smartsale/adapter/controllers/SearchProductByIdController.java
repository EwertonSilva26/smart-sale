package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.SearchProductByIdUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class SearchProductByIdController {

    @Autowired
    private SearchProductByIdUseCaseInterface useCase;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws Exception {
        Optional<Product> product = Optional.ofNullable(useCase.getProductById(id));

        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(product.get()));

    }
}