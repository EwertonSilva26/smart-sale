package com.softwarearchitecture.smartsale.adapter.repositories.impl;

import com.softwarearchitecture.smartsale.adapter.repositories.LoginUserRepositoryInterface;
import com.softwarearchitecture.smartsale.adapter.repositories.RegisterUserRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.utils.MySQLDataBase;
import org.springframework.stereotype.Repository;

@Repository
public class LoginUserRepository implements LoginUserRepositoryInterface {

//    @Override
//    public User loginUser(User user) {
//        user.setId((long) (MySQLDataBase.getUsers().size()+1));
//        MySQLDataBase.setUser(user);
//
//        return user;
//    }

    @Override
    public User LoginUser(User user) throws Exception {
        for (User item : MySQLDataBase.getUsers()) {
            if(item.getEmail().equals(user.getEmail()) &&
                    item.getPassword().equals(user.getPassword())) {

                if(item.getEmail().contains("@admin")) {
                    MySQLDataBase.loggedUser("adm");
                    user.setType("adm");
                } else {
                    MySQLDataBase.loggedUser("admin");
                    user.setType("user");
                }
            }
        }

        if(user.getType() == null) {
            throw new Exception("Usuario não cadastrado");
        }

        return user;
    }
}
