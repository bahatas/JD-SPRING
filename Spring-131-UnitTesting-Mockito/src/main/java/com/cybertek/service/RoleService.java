package com.cybertek.service;


import com.cybertek.dto.RoleDTO;

import java.util.List;


public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id);


    //RoleDTO
    //Role save
    //Role find
    //Role findById
    //Find All roles
    //Delete roles
    //Roles delete by ID



}
