package com.cybertek.interfaces.carpetprice;

import com.cybertek.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSquareFtPrice( City city);
}
