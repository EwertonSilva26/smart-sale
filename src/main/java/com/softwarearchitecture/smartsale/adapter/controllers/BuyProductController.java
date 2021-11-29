package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.entities.Receipt;
import com.softwarearchitecture.smartsale.useCase.BuyProductUseCaseInterface;
import com.softwarearchitecture.smartsale.utils.VerifyUser;
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
    public ResponseEntity<Receipt> buyProduct(@RequestBody List<Product> productsList) throws Exception {

        VerifyUser.checkUser();

        Optional<Receipt> receipt = Optional.ofNullable(useCase.buyProduct(productsList));

        return receipt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(receipt.get()));

    }
}
