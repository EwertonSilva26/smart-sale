package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Receipt;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.BuyProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products/sales")
@CrossOrigin(origins = "*")
public class BuyProductController {

    @Autowired
    private BuyProductUseCaseInterface useCase;

    @PostMapping
    public ResponseEntity<Receipt>  buyProduct(@RequestBody List<Product> productsList) {
        Optional<Receipt> comprovante = Optional.ofNullable(useCase.buyProduct(productsList));

        if (!comprovante.isPresent()) {
            return ResponseEntity.badRequest().body(comprovante.get());
        }

        return ResponseEntity.ok(comprovante.get());
    }
}
