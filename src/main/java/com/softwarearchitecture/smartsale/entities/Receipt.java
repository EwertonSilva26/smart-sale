package com.softwarearchitecture.smartsale.entities;

import java.util.List;

public class Receipt {

    private List<Product> products;
    private Long totalItem;
    private double totalValue;
    private String saleDate;

    public Receipt(List<Product> products, Long totalItem, double totalValue, String saleDate) {
        this.products = products;
        this.totalItem = totalItem;
        this.totalValue = totalValue;
        this.saleDate = saleDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Long getTotalItem() {
        return totalItem;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public String getSaleDate() {
        return saleDate;
    }
}
