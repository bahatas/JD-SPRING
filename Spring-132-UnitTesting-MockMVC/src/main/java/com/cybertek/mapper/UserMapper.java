package com.cybertek.mapper;

import com.cybertek.dto.UserDTO;
import com.cybertek.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    
  ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //dto to entity
    public User convertToEntity(UserDTO userDTO){
        return modelMapper.map(userDTO,User.class);
    }

    //entitiy to user
    public UserDTO convertToDto(User userEntity){
        return modelMapper.map(userEntity,UserDTO.class);
    }


}
