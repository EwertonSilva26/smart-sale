package com.softwarearchitecture.smartsale.useCase.services;

import com.softwarearchitecture.smartsale.adapter.repositories.RegisterUserRepositoryInterface;
import com.softwarearchitecture.smartsale.entities.Person;
import com.softwarearchitecture.smartsale.useCase.RegisterUserUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUsertUseCase implements RegisterUserUseCaseInterface {

    @Autowired
    public RegisterUserRepositoryInterface repository;

    @Override
    public Person registerUser(Person person) {
        return repository.registerUser(person);
    }
}
