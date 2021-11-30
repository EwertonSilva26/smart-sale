package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.LoginUserRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.useCase.LoginUserUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUsertUseCase implements LoginUserUseCaseInterface {

    @Autowired
    public LoginUserRepositoryInterface repository;

    @Override
    public User loginUser(User user) throws Exception {
        return repository.LoginUser(user);
    }

}
