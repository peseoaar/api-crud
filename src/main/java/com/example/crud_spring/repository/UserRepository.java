package com.example.crud_spring.repository;

import com.example.crud_spring.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer>{
    
}




