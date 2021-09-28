package com.cybertek.converter;


import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
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
