package com.restfull.crud_restfullapi.sevice.impl;

import com.restfull.crud_restfullapi.Dto.UserDto;
import com.restfull.crud_restfullapi.entity.User;
import com.restfull.crud_restfullapi.repositoty.UserRepository;
import com.restfull.crud_restfullapi.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDto userDto) {
        User employee = new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                this.passwordEncoder.encode(userDto.getPassword())
        );
        userRepository.save(employee);
        return employee.getName();
    }
}
