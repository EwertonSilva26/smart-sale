package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.RegisterUserRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.useCase.RegisterUserUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUsertUseCase implements RegisterUserUseCaseInterface {

    @Autowired
    public RegisterUserRepositoryInterface repository;

    @Override
    public User registerUser(User user) {
        return repository.registerUser(user);
    }
}
