package com.softwarearchitecture.smartsale.useCase;

import com.softwarearchitecture.smartsale.entity.Product;

import java.util.List;

public interface SearchProductByIdUseCaseInterface {

    Product getProductById(Long id);

}
