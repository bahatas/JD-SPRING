package com.cydeo.spring1141restconsumingapi.controller;


import com.cydeo.spring1141restconsumingapi.client.UserClient;
import com.cydeo.spring1141restconsumingapi.dto.ResponseWrapper;
import com.cydeo.spring1141restconsumingapi.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Consume_FeignClient {

    private final UserClient userClient;

    public Consume_FeignClient(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("api/v1/users")
    public ResponseEntity<ResponseWrapper> getUsers(){

        List<User> users = userClient.getUsers();
        return ResponseEntity.ok(new ResponseWrapper("User list retrieved by feign client",users));
    }


}
