package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.SaveProductUseCaseInterface;
import com.softwarearchitecture.smartsale.useCase.UpdateProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products/update")
@CrossOrigin(origins = "*")
public class UpdateProductController {

    @Autowired
    private UpdateProductUseCaseInterface useCase;

    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product, @PathVariable("id") Long id) {
        Optional<Product> newProduct = Optional.ofNullable(useCase.updateProduct(product, id));

        if (!newProduct.isPresent()) {
            return ResponseEntity.badRequest().body(newProduct.get());
        }

        return ResponseEntity.ok(newProduct.get());
    }
}
