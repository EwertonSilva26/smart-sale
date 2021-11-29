package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.useCase.LoginUserUseCaseInterface;
import com.softwarearchitecture.smartsale.useCase.RegisterUserUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products/login")
@CrossOrigin(origins = "*")
public class LoginUserUserController {

    @Autowired
    private LoginUserUseCaseInterface useCase;

    @PostMapping
    public ResponseEntity<User> LoginUser(@RequestBody User user) throws Exception {
        Optional<User> newUser = Optional.ofNullable(useCase.loginProduct(user));

        return newUser.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .badRequest()
                .body(newUser.get()));

    }

}
