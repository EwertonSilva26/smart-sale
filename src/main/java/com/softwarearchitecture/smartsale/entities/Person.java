package com.softwarearchitecture.smartsale.entities;

import java.io.Serializable;

public class Person implements Serializable {

    private Long id;
    private String name;
    private String middleName;
    private Address address;
    private String email;
    private String password;

    public Person(Long id, String name, String middleName, Address address, String email, String password) {
        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
