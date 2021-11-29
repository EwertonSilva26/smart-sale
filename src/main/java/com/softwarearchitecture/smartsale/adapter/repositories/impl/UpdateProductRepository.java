package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.UpdateProductRepositoryInterface;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import com.softwarearchitecture.smartsale.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateProductRepository implements UpdateProductRepositoryInterface {

    @Override
    public Product updateProduct(Product product, Long id) {
        int code = (int) (id - 1);

        product.setCode(id);
        MySQLDataBase.getAll().set(code, product);

        return product;
    }
}
