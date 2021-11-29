package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.SaveProductRepositoryInterface;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import com.softwarearchitecture.smartsale.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class SaveProductRepository implements SaveProductRepositoryInterface {

    @Override
    public Product saveProduct(Product product) {
        product.setCode((long) MySQLDataBase.getAll().size() + 1);
        MySQLDataBase.getAll().add(product);

        return MySQLDataBase.getAll().get(MySQLDataBase.getAll().size() - 1);
    }
}
