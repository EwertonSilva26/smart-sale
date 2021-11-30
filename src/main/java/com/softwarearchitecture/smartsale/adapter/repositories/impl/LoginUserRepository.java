package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.LoginUserRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Person;
import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import org.springframework.stereotype.Repository;

@Repository
public class LoginUserRepository implements LoginUserRepositoryInterface {

    @Override
    public User LoginUser(User user) throws Exception {
        for (Person item : MySQLDataBase.getUsers()) {
            if (item.getEmail().equals(user.getEmail()) &&
                    item.getPassword().equals(user.getPassword())) {

                if (item.getEmail().contains("@admin")) {
                    MySQLDataBase.loggedUser("admin");
                } else {
                    MySQLDataBase.loggedUser("user");
                }
            }
        }

        if (MySQLDataBase.getLoggedUser() == null) {
            throw new Exception("Usuario não cadastrado");
        }

        return user;
    }
}
