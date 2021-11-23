package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.SaleProductRepositoryInterface;
import com.softwarearchitecture.smartsale.adapter.SearchProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entity.Comprovante;
import com.softwarearchitecture.smartsale.entity.Product;
import com.softwarearchitecture.smartsale.useCase.SaleProductUseCaseInterface;
import com.softwarearchitecture.smartsale.useCase.SearchProductUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleProductUseCase implements SaleProductUseCaseInterface {

    @Autowired
    public SaleProductRepositoryInterface repository;


    @Override
    public Comprovante saleProduct(List<Product> productList) {
        return repository.saleProduct(productList);
    }
}
