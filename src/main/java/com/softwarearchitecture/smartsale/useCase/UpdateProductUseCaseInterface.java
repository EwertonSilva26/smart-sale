package com.softwarearchitecture.smartsale.useCase;

import com.softwarearchitecture.smartsale.entities.Product;

public interface UpdateProductUseCaseInterface {

    Product updateProduct(Product product, Long id);

}
