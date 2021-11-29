package com.softwarearchitecture.smartsale.useCase;

import com.softwarearchitecture.smartsale.entities.Receipt;
import com.softwarearchitecture.smartsale.entities.Product;

import java.util.List;

public interface BuyProductUseCaseInterface {

    Receipt buyProduct(List<Product> productList);

}
