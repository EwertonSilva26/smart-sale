package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.useCase.RegisterUserUseCaseInterface;
import com.softwarearchitecture.smartsale.utils.VerifyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products/register")
@CrossOrigin(origins = "*")
public class RegisterUserController {

    @Autowired
    private RegisterUserUseCaseInterface useCase;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user) throws Exception {

        VerifyUser.checkRegisterUser(user);

        Optional<User> newUser = Optional.ofNullable(useCase.registerUser(user));

        return newUser.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(newUser.get()));
    }
}