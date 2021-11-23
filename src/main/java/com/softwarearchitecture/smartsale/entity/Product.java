package com.softwarearchitecture.smartsale.entity;

import java.math.BigDecimal;

public class Product {

    private Long code;
    private String name;
    private double price;
    private Long qtd;

    public Product(Long code, String name, double price, Long qtd) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getQtd() {
        return qtd;
    }

    public void setQtd(Long qtd) {
        this.qtd = qtd;
    }
}
