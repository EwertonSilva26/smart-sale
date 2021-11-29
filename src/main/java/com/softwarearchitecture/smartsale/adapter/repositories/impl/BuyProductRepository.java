package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.BuyProductRepositoryInterface;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import com.softwarearchitecture.smartsale.entities.Receipt;
import com.softwarearchitecture.smartsale.entities.Product;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class BuyProductRepository implements BuyProductRepositoryInterface {


    @Override
    public Receipt buyProduct(List<Product> productList) {
        return generateSalesReceipt(productList);
    }

    private Receipt generateSalesReceipt(List<Product> productList) {
        double totalPrice = 0.0;
        Long totalItems = 0L;


        for (Product item : productList) {

            if (item.getCode() > 0) {
                Product newItem = new Product(item.getCode(), item.getName(), item.getPrice(), item.getQtd());
                Product product = MySQLDataBase.getAll().get(Math.toIntExact(item.getCode() - 1));

                item.setPrice(product.getPrice());

                totalPrice += product.getPrice() * item.getQtd();
                totalItems += item.getQtd();

                newItem.setQtd(product.getQtd() - item.getQtd());
                newItem.setPrice(product.getPrice());

                MySQLDataBase.getAll().set(Math.toIntExact(item.getCode() - 1), newItem);
            }
        }

        return new Receipt(productList, totalItems, totalPrice, getDate());

    }

    private String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
