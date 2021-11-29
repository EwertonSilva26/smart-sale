package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.SaveProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.SaveProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveProductUseCase implements SaveProductUseCaseInterface {

    @Autowired
    public SaveProductRepositoryInterface repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.saveProduct(product);
    }
}
