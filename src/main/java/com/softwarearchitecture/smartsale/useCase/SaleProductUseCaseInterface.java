package com.softwarearchitecture.smartsale.useCase;

import com.softwarearchitecture.smartsale.entity.Comprovante;
import com.softwarearchitecture.smartsale.entity.Product;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface SaleProductUseCaseInterface {

    Comprovante saleProduct(List<Product> productList);

}
