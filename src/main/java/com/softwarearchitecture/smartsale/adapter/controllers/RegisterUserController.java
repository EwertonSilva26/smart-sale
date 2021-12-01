package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.Person;
import com.softwarearchitecture.smartsale.useCase.RegisterUserUseCaseInterface;
import com.softwarearchitecture.smartsale.utils.VerifyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/home/register")
@CrossOrigin(origins = "*")
public class RegisterUserController {

    @Autowired
    private RegisterUserUseCaseInterface useCase;

    @PostMapping
    public ResponseEntity<Person> registerUser(@RequestBody Person person) throws Exception {

        VerifyUser.checkRegisterUser(person);

        Optional<Person> newUser = Optional.ofNullable(useCase.registerUser(person));

        return newUser.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(newUser.get()));
    }
}