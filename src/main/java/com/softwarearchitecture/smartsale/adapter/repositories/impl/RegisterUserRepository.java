package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.RegisterUserRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterUserRepository implements RegisterUserRepositoryInterface {

    @Override
    public User registerUser(User user) {
        user.setId((long) (MySQLDataBase.getUsers().size()+1));
        MySQLDataBase.setUser(user);

        return user;
    }
}
