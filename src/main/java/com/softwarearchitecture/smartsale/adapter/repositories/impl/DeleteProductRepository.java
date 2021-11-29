package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.DeleteProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteProductRepository implements DeleteProductRepositoryInterface {

    @Override
    public void deleteProduct(Long id) {
        int n = (int) (id-1);
        Product p  = MySQLDataBase.getAll().get(n);

        MySQLDataBase.getAll().remove(p);
    }
}
