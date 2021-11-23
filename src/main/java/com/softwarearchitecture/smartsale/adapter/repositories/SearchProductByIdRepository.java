package com.softwarearchitecture.smartsale.adapter.repositories;

import com.softwarearchitecture.smartsale.adapter.SearchProductByIdRepositoryInterface;
import com.softwarearchitecture.smartsale.entity.Product;
import com.softwarearchitecture.smartsale.db.DataBase;
import org.springframework.stereotype.Repository;

@Repository
public class SearchProductByIdRepository implements SearchProductByIdRepositoryInterface {

    @Override
    public Product getProductById(Long id) {
        return DataBase.getAll().get(Math.toIntExact(id-1));
    }
}
