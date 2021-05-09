package com.cybertek.model;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mentor {

    private String firstanme;
    private String lastname;
    private String email;
    private String gender;
    private boolean graduated;
    private String batch;
    private String company;
}
