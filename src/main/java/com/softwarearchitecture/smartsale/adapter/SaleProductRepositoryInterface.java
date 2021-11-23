package com.softwarearchitecture.smartsale.adapter;

import com.softwarearchitecture.smartsale.entity.Comprovante;
import com.softwarearchitecture.smartsale.entity.Product;

import java.util.List;

public interface SaleProductRepositoryInterface {

    Comprovante saleProduct(List<Product> productList);

}
