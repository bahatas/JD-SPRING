package com.cybertek.implementation;

import com.ticketing.dto.UserDTO;
import com.ticketing.entity.User;
import com.ticketing.mapper.UserMapper;
import com.ticketing.repository.UserRepository;
import com.ticketing.service.UserService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl  implements UserService {


    @Autowired
    UserRepository userRepository;


    UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> ListAllUSer() {
     var list = userRepository.findAll(Sort.by("firstName"));

        //convert entity to DTO
        return list.stream().map(each->{return userMapper.convertToDto(each); }).collect(Collectors.toList());
    }

    @Override
    public UserDTO findByUserName(String username) {
        return null;
    }



    @Override
    public void save(UserDTO userDTO) {


        //dto to entity
       User user= userMapper.convertToEntity(userDTO);

        //save with implemented method via Jpa
        userRepository.save(user);
    }

    @Override
    public UserDTO update(String username) {
        return null;
    }

    @Override
    public void delete(String username) {

    }
}
