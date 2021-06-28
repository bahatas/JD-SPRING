package com.cybertek.entity;


import com.cybertek.enums.UserRole;
import com.cybertek.enums.UserState;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Where(clause = "is_deleted=false")
public class User extends BaseEntity{

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Enumerated(value = EnumType.STRING)
    private UserRole role;


    private Boolean isVerified;

    @Enumerated(value = EnumType.STRING)
    private UserState state;







}
