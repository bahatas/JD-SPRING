package com.cybertek.implementation;

import com.cybertek.mapper.MapperUtil;
import com.cybertek.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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

        //I dont care this data is correct.
        userService.deleteByUserName("r@cybertek.com");

        verify(userRepository).deleteByUserName("r@cybertek.com");
        //it runs 2 times
        //verify(userRepository,times(2)).deleteByUserName("r@cybertek.com");

        verify(userRepository,atLeastOnce()).deleteByUserName("r@cybertek.com");
        verify(userRepository,atMost(2)).deleteByUserName("r@cybertek.com");
    }

    @Test
    void test1(){

        verify(userService.findByUserName("mike@cybertek.com"));
    }
}