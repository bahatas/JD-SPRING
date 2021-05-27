package com.cybertek.entity;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account {

    BigDecimal creditLimit;
}
