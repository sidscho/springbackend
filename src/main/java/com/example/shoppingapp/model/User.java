package com.example.shoppingapp.model;

import jakarta.persistence.*;

@Entity

public class User {
    @Id

    private int id;
    private String name, email, password, role;

     public User(){}
     public User( String name, String email, String password, String role) {

        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }


}
