package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.SearchProductByIdRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import org.springframework.stereotype.Repository;

@Repository
public class SearchProductByIdRepository implements SearchProductByIdRepositoryInterface {

    @Override
    public Product getProductById(Long id) {
        return MySQLDataBase.getAll().get(Math.toIntExact(id-1));
    }
}
