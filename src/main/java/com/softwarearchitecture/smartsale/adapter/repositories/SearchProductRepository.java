package com.softwarearchitecture.smartsale.adapter.repositories;

import com.softwarearchitecture.smartsale.adapter.SearchProductRepositoryInterface;
import com.softwarearchitecture.smartsale.entity.Product;
import com.softwarearchitecture.smartsale.db.DataBase;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SearchProductRepository implements SearchProductRepositoryInterface {

    @Override
    public List<Product> getProducts() {
        return DataBase.getAll();
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
