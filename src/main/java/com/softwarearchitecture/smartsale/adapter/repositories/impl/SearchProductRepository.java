package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.SearchProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SearchProductRepository implements SearchProductRepositoryInterface {

    @Override
    public List<Product> getProducts() {
        return MySQLDataBase.getAll();
    }

}
