package com.cybertek;

import java.util.Arrays;




public class UnitTestingImpl {


    DataRepository dataRepository;

    public UnitTestingImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public UnitTestingImpl() {

    }

    public int calculationSum(int [] data ){

        int sum = Arrays.stream(data).sum();
        return sum;
    }


    public int calculationSum_withusing_DataService( ){

        int sum = Arrays.stream(dataRepository.findAll()).sum();
        return sum;
    }
}
