package com.pixelschoice.jpa.springjpahibernateexample.resource;


import com.pixelschoice.jpa.springjpahibernateexample.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pixelschoice.jpa.springjpahibernateexample.repository.UsersRepository;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/all")
    public List<Users> getAll(){

        return usersRepository.findAll();
        }

    }


