package com.cybertek.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    @Autowired
    CheckingAccount checkingAccount;


    @BeforeEach
    void setUp() {

        checkingAccount = new CheckingAccount();
        checkingAccount.setInfo(100,1234567L,"Costumer");

    }

    @AfterEach
    void tearDown() {
    }
    // No need to test set info

    @Test
    void deposit() {

        assertEquals(200,checkingAccount.deposit(100));
    }

    @Test
    void withDraw() {
        assertEquals(80,checkingAccount.withDraw(20));
    }

    @Test
    void purchase() {
        assertEquals(-65,checkingAccount.purchase("Shoes",130));
        //fail
    }

    @Test
    void withdraw_branch_testing(){
        assertThrows(IllegalArgumentException.class,()-> {
            checkingAccount.withdraw_branch(600, false);
        }); // we need an executible definiton after lamba sign
    }
}