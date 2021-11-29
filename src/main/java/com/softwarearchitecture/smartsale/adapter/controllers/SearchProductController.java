package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.SearchProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class SearchProductController {

    @Autowired
    private SearchProductUseCaseInterface useCase;

    @GetMapping()
    public ResponseEntity<List<Product>> getProduct() throws Exception {
        Optional<List<Product>> products = Optional.ofNullable(useCase.getProducts());

        return products.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(products.get()));

    }

}
