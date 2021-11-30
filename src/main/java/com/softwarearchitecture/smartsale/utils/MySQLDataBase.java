package com.softwarearchitecture.smartsale.utils;

import com.softwarearchitecture.smartsale.entities.Product;
import com.softwarearchitecture.smartsale.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class MySQLDataBase {

    private static final List<Product> products = new ArrayList<>();
    private static final List<Person> users = new ArrayList<>();
    private static String logged;

    static {
        Person admin = new Person(1L, "Ewerton", "Silva", null, "ewerton@admin.com", "123");
        users.add(admin);

        Product product1 = new Product(1L, "Arroz", 20.00, 50L);
        Product product2 = new Product(2L, "Feijão", 10.00, 100L);
        Product product3 = new Product(3L, "Macarrão", 07.00, 30L);
        Product product4 = new Product(4L, "Maquina de lavar", 2.200, 80L);
        Product product5 = new Product(5L, "Refrigerante", 05.00, 50L);
        Product product6 = new Product(6L, "Sabão em pó", 12.00, 60L);
        Product product7 = new Product(7L, "Vassoura", 10.00, 80L);
        Product product8 = new Product(8L, "Rodo", 8.00, 45L);
        Product product9 = new Product(9L, "Panela", 50.00, 12L);
        Product product10 = new Product(10L, "Max still", 6.00, 55L);
        Product product11 = new Product(11L, "Leite", 05.00, 34L);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        products.add(product11);

    }

    public static List<Product> getAll() {
        return products;
    }

    public static void setUser(Person user) { users.add(user);}

    public static List<Person> getUsers() {
        return users;
    }

    public static void loggedUser(String type) { logged = type; }

    public static String getLoggedUser() { return logged; }



}
