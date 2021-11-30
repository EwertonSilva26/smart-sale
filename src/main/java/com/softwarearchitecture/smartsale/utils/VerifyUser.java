package com.softwarearchitecture.smartsale.utils;

import com.softwarearchitecture.smartsale.entities.Person;

import java.util.Objects;

public class VerifyUser {

    public static void checkUser() throws Exception {
        if (MySQLDataBase.getLoggedUser() != "user") {
            throw new Exception("Usuario invalido");
        }
    }

    public static void checkRegisterUser(Person user) throws Exception {
        if (user.getEmail().contains("@admin")) {
            throw new Exception("Você não pode se cadastrar como aministrador");
        }
    }

    public static void checkAdmin() throws Exception {
        if (!Objects.equals(MySQLDataBase.getLoggedUser(), "admin")) {
            throw new Exception("Usuario não tem permissão para efetuar essa operação");
        }
    }
}
