package com.softwarearchitecture.smartsale.adapter.repositories;

import com.softwarearchitecture.smartsale.entities.Receipt;
import com.softwarearchitecture.smartsale.entities.Product;

import java.util.List;

public interface BuyProductRepositoryInterface {

    Receipt buyProduct(List<Product> productList);

}
