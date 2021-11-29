package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.useCase.DeleteProductUseCaseInterface;
import com.softwarearchitecture.smartsale.utils.VerifyUser;
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
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") Long id) throws Exception {

        VerifyUser.checkAdmin();

        useCase.deleteProduct(id);

        return ResponseEntity.noContent().build();
    }
}
