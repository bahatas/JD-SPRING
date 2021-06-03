package com.cybertek.repository;

import com.cybertek.entity.Employee;
import com.cybertek.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {

 //display all regions in Canada
    List<Region> findByCountry(String country);

    //display all regions in canada, without dublicate

    //Dosplay all regions with country name includes 'United'



    //Dosplay all regions with country name includes 'United' in order

    //Display top 2 reegions in Canada

    //








}
