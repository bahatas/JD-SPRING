package com.cybertek.mapper;

import com.cybertek.dto.RoleDTO;
import com.cybertek.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {


    private ModelMapper modelMapper;


    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Role convertToEntity(RoleDTO roleDTO){
        return modelMapper.map(roleDTO,Role.class);
    }

    public RoleDTO convertToDto(Role roleEntity){
        return modelMapper.map(roleEntity,RoleDTO.class);
    }
}
