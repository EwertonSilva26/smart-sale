package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.UpdateProductUseCaseInterface;
import com.softwarearchitecture.smartsale.utils.VerifyUser;
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
    public ResponseEntity<Product> saveProduct(@RequestBody Product product, @PathVariable("id") Long id) throws Exception {

        VerifyUser.checkAdmin();

        Optional<Product> newProduct = Optional.ofNullable(useCase.updateProduct(product, id));

        return newProduct.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(newProduct.get()));

    }
}
