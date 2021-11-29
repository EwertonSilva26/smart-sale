package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.DeleteProductRepositoryInterface;
import com.softwarearchitecture.smartsale.useCase.DeleteProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteProductUseCase implements DeleteProductUseCaseInterface {

    @Autowired
    public DeleteProductRepositoryInterface repository;

    @Override
    public void deleteProduct(Long id) {
        repository.deleteProduct(id);
    }
}
