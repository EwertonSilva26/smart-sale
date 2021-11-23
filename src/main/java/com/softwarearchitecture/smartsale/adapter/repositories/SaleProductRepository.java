package com.softwarearchitecture.smartsale.adapter.repositories;

import com.softwarearchitecture.smartsale.adapter.SaleProductRepositoryInterface;
import com.softwarearchitecture.smartsale.db.DataBase;
import com.softwarearchitecture.smartsale.entity.Comprovante;
import com.softwarearchitecture.smartsale.entity.Product;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class SaleProductRepository implements SaleProductRepositoryInterface {


    @Override
    public Comprovante saleProduct(List<Product> productList) {
        return generateSalesReceipt(productList);
    }

    private Comprovante generateSalesReceipt(List<Product> productList) {
        double totalPrice = 0.0;
        Long totalItems = 0L;


        for (Product item : productList) {

            if (item.getCode() > 0) {
                Product newItem = new Product(item.getCode(), item.getName(), item.getPrice(), item.getQtd());
                Product product = DataBase.getAll().get(Math.toIntExact(item.getCode() - 1));

                item.setPrice(product.getPrice());

                totalPrice += product.getPrice() * item.getQtd();
                totalItems += item.getQtd();

                newItem.setQtd(product.getQtd() - item.getQtd());
                newItem.setPrice(product.getPrice());

                DataBase.getAll().set(Math.toIntExact(item.getCode() - 1), newItem);
            }
        }

        return new Comprovante(productList, totalItems, totalPrice, getDate());

    }

    private String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
