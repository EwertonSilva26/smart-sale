package com.softwarearchitecture.smartsale.adapter;

import com.softwarearchitecture.smartsale.entity.Product;

import java.util.List;

public interface SearchProductByIdRepositoryInterface {

    Product getProductById(Long id);
}
