package com.softwarearchitecture.smartsale.useCase;

import com.softwarearchitecture.smartsale.entities.Product;

public interface SearchProductByIdUseCaseInterface {

    Product getProductById(Long id);

}
