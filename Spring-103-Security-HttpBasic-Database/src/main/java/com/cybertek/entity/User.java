package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;
    private String password;
    private int active;
    private String roles;
    private String permission;

    public User( String username, String password,
                String roles, String permission) {

        this.username = username;
        this.password = password;
        this.active = 1;
        this.roles = roles;
        this.permission = permission;
    }

    //public List<String> getRoleList
}
