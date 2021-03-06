package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.SaveProductUseCaseInterface;
import com.softwarearchitecture.smartsale.utils.VerifyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products/save")
@CrossOrigin(origins = "*")
public class SaveProductController {

    @Autowired
    private SaveProductUseCaseInterface useCase;

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) throws Exception {

        VerifyUser.checkAdmin();

        Optional<Product> newProduct = Optional.ofNullable(useCase.saveProduct(product));

        return newProduct.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(newProduct.get()));

    }
}
