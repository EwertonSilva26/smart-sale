package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.DeleteProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/delete")
@CrossOrigin(origins = "*")
public class DeleteProductController {

    @Autowired
    private DeleteProductUseCaseInterface useCase;

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") Long id) {
       useCase.deleteProduct(id);

        return ResponseEntity.noContent().build();
    }
}
