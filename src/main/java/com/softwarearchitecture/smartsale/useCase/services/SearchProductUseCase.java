package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.SearchProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.useCase.SearchProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchProductUseCase implements SearchProductUseCaseInterface {

    @Autowired
    public SearchProductRepositoryInterface repository;

    @Override
    public List<Product> getProducts() {
       return repository.getProducts();
    }

}
