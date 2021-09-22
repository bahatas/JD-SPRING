package com.cybertek.converter;


import com.ticketing.dto.UserDTO;
import com.ticketing.service.UserService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class UserDtoConverter implements Converter<String, UserDTO> {

    UserService userService;

    @Override
    public UserDTO convert(String source) {

        return userService.findByUserName(source);
    }
}
