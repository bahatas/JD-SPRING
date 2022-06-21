package com.cybertek.service;

import com.cybertek.entity.User;
import com.cybertek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService  {

    @Autowired
    UserRepository userRepository;


    public List<User> getUser(){

        List<User> all = userRepository.findAll();

        List<UserDto> userdto  = new ArrayList<>();

        return all;

    }
}
