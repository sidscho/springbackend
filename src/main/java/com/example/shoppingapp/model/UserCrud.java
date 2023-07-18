package com.example.shoppingapp.model;

import org.springframework.data.repository.CrudRepository;

public interface UserCrud extends CrudRepository<User, Integer> {
}
