package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entity.Comprovante;
import com.softwarearchitecture.smartsale.entity.Product;
import com.softwarearchitecture.smartsale.useCase.SaleProductUseCaseInterface;
import com.softwarearchitecture.smartsale.useCase.SearchProductByIdUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products/sales")
@CrossOrigin(origins = "*")
public class SaleProductController {

    @Autowired
    private SaleProductUseCaseInterface useCase;

    @PostMapping
    public ResponseEntity<Comprovante>  saleProduct(@RequestBody List<Product> productsList) {
        Optional<Comprovante> comprovante = Optional.ofNullable(useCase.saleProduct(productsList));

        if (!comprovante.isPresent()) {
//            log.info("Empresa não encontrada para o CNPJ: {}", cnpj);
            return ResponseEntity.badRequest().body(comprovante.get());
        }

        return ResponseEntity.ok(comprovante.get());
    }
}
