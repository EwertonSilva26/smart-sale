package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.SearchProductByIdRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.SearchProductByIdUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchProductByIdUseCase implements SearchProductByIdUseCaseInterface {

    @Autowired
    public SearchProductByIdRepositoryInterface repository;

    @Override
    public Product getProductById(Long id) {
        return repository.getProductById(id);
    }
}
