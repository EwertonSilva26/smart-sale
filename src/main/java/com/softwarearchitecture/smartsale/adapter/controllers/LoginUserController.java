package com.softwarearchitecture.smartsale.adapter.controllers;

import com.softwarearchitecture.smartsale.entities.User;
import com.softwarearchitecture.smartsale.useCase.LoginUserUseCaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/home/login")
@CrossOrigin(origins = "*")
public class LoginUserController {

    @Autowired
    private LoginUserUseCaseInterface useCase;

    @PostMapping
    public ResponseEntity<String> LoginUser(@RequestBody User user) throws Exception {
        Optional<User> newUser = Optional.ofNullable(useCase.loginUser(user));

        if(!newUser.isPresent()) {
            return new ResponseEntity<String>("Login/Senha invalidos", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<String>("Login efetuado com sucesso!", HttpStatus.ACCEPTED);
    }

}
