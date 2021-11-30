package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.RegisterUserRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Person;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterUserRepository implements RegisterUserRepositoryInterface {

    @Override
    public Person registerUser(Person user) {
        user.setId((long) (MySQLDataBase.getUsers().size()+1));
        MySQLDataBase.setUser(user);

        return user;
    }
}
