package com.example.shoppingapp.controller;

import com.example.shoppingapp.model.User;
import com.example.shoppingapp.model.UserCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired // approriate object is assigned to this interface reference
    UserCrud userCrud;

    @GetMapping("/signup")
    public boolean signup(){
        System.out.println("Signup Req received");
        User user1 = new User("Siddhesh","sid@gmail.com","xyz","user");
        userCrud.save(user1);
        return true;
    }

    @GetMapping("/")
    public String login(){
        System.out.println("REquest received");
        return "Welcome";
    }
}
