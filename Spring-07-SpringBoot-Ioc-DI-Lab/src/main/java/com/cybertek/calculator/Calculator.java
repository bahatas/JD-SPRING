package com.cybertek.calculator;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetprice.Carpet;
import com.cybertek.interfaces.floortype.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;



@Component
public class Calculator {

    @Qualifier("livingRoom")
    @Autowired
    private Floor floor;

    @Qualifier("carpetTX")
    @Autowired
    private Carpet carpet;

    public String getTotalCarpetCost(City city) throws Exception {
        BigDecimal carpetcost = floor.getArea().multiply(carpet.getSquareFtPrice(city));

        if(carpetcost.compareTo(BigDecimal.ZERO)==0){
            throw  new Exception("This city does not exist");
        }

        return "Total Carpet Cost : "+floor.getArea().multiply(carpet.getSquareFtPrice(city));
    }
}
