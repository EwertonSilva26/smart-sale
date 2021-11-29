package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.useCase.RegisterUserUseCaseInterface;
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
    public ResponseEntity<User> saveProduct(@RequestBody User user) {
        Optional<User> newUser = Optional.ofNullable(useCase.registerUser(user));
        System.out.println(newUser.get());

        if (!newUser.isPresent()) {
            return ResponseEntity.badRequest().body(newUser.get());
        }

        return ResponseEntity.ok(newUser.get());
    }

}
