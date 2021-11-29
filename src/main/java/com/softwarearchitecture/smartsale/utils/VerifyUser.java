package com.softwarearchitecture.smartsale.utils;

import com.softwarearchitecture.smartsale.entities.User;

public class VerifyUser {

    public static void checkUser() throws Exception {
        if (MySQLDataBase.getLoggedUser() != "user") {
            throw new Exception("Usuario invalido");
        }
    }

    public static void checkRegisterUser(User user) throws Exception {
        if (user.getEmail().contains("@admin")) {
            throw new Exception("Você não pode se cadastrar como aministrador");
        }
    }

    public static void checkAdmin() throws Exception {
        if (MySQLDataBase.getLoggedUser() != "admin") {
            throw new Exception("Usuario não tem permissão para efetuar essa operação");
        }
    }
}
