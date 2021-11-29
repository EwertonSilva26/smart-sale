package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.UpdateProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.UpdateProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductUseCase implements UpdateProductUseCaseInterface {

    @Autowired
    public UpdateProductRepositoryInterface repository;

    @Override
    public Product updateProduct(Product product, Long id) {
        return repository.updateProduct(product, id);
    }

}
