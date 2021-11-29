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

//    @Override
//    public Product getProductById(Long id) {
//        return getAllProducts().get(Math.toIntExact(id-1));
//    }
//
//    @Override
//    public void saveProduct(Product product) {
//        Long code = this.products.size() + 1L;
//        product.setCode(code);
//
//        this.products.add(product);
//    }
//
//    @Override
//    public void deleteProduct(Long id) {
//        getAllProducts().remove(Math.toIntExact(id-1));
//    }

}
