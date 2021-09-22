package com.cybertek.implementation;

import com.ticketing.dto.RoleDTO;
import com.ticketing.mapper.RoleMapper;
import com.ticketing.repository.RoleRepository;
import com.ticketing.service.RoleService;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl  implements RoleService {

    private RoleRepository roleRepository;
    private RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        var list =roleRepository.findAll();
        return list.stream().map(each->{return  roleMapper.convertToDto(each);}).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(Long id) {
      var role = roleRepository.findById(id).get();
       return roleMapper.convertToDto(role) ;
    }
}
