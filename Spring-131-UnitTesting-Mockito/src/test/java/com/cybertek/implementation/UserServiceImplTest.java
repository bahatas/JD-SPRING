package com.cybertek.implementation;

import com.cybertek.mapper.MapperUtil;
import com.cybertek.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {


    @Mock
    UserRepository userRepository;

    @Mock
    MapperUtil mapperUtil;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    void delete() {

        userService.delete("r@cybertek.com");

        verify(userRepository).deleteByUsername("r@cybertek.com");
        verify(userRepository,times(2)).deleteByUsername("r@cybertek.com");
        verify(userRepository,atLeastOnce()).deleteByUsername("r@cybertek.com");
        verify(userRepository,atMost(2)).deleteByUsername("r@cybertek.com");
    }
}