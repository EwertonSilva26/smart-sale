package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.BuyProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Receipt;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.BuyProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyProductUseCase implements BuyProductUseCaseInterface {

    @Autowired
    public BuyProductRepositoryInterface repository;


    @Override
    public Receipt buyProduct(List<Product> productList) {
        return repository.buyProduct(productList);
    }
}
