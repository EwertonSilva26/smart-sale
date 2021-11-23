package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entity.Product;
import com.softwarearchitecture.smartsale.useCase.SearchProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class SearchProductController {

    @Autowired
    private SearchProductUseCaseInterface useCase;

    @GetMapping()
    public ResponseEntity<List<Product>> getProduct() {
        Optional<List<Product>> products = Optional.ofNullable(useCase.getProducts());

        if (!products.isPresent()) {
//            log.info("Empresa não encontrada para o CNPJ: {}", cnpj);
            return ResponseEntity.badRequest().body(products.get());
        }

        return ResponseEntity.ok(products.get());
    }

}
