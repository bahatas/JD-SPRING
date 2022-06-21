package com.cydeo.spring1141restconsumingapi.controller;


import com.cydeo.spring1141restconsumingapi.dto.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class Consume_RestTemplate {

    private final String URI =  "https://jsonplaceholder.typicode.com/users";

    private final RestTemplate restTemplate;

    public Consume_RestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public User[] readAllUsers(){

        ResponseEntity<User[]> forEntity = restTemplate.getForEntity(URI, User[].class);

        return forEntity.getBody();
    }

    @GetMapping("/users/{id}")
    public User readUser(@PathVariable("id") Integer useridToGet){

        String URL = URI + "/{id}";

        return restTemplate.getForObject(URL,User.class,useridToGet);
    }

    @GetMapping("/test")
    public ResponseEntity<Object> consumeFromDummyApi(){

        String URL = "https://dummyapi.io/data/v1/user?limit=10";

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("app-id","6298ebfecd0551211fce37a6");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Object> exchange =
                restTemplate.exchange(URL, HttpMethod.GET, entity, Object.class);

        return exchange;
    }

}
