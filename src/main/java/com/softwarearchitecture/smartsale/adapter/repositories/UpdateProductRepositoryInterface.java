package com.softwarearchitecture.smartsale.adapter.repositories;

import com.softwarearchitecture.smartsale.entities.Product;

public interface UpdateProductRepositoryInterface {

    Product updateProduct(Product product, Long id);

}
