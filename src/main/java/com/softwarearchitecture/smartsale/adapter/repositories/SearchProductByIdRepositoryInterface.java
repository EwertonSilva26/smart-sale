package com.softwarearchitecture.smartsale.adapter.repositories;

import com.softwarearchitecture.smartsale.entities.Product;

public interface SearchProductByIdRepositoryInterface {

    Product getProductById(Long id);
}
