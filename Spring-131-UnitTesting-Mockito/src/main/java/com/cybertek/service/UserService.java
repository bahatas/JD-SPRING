package com.cybertek.service;


import com.cybertek.dto.UserDTO;

import java.util.List;


public interface UserService {


    List<UserDTO> ListAllUSer();
    UserDTO findByUserName(String username);
    void save(UserDTO userDTO);
    UserDTO update(String username);
    void delete(String username);



}
