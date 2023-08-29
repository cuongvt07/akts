package com.restfull.crud_restfullapi.controller;

import com.restfull.crud_restfullapi.Dto.UserDto;
import com.restfull.crud_restfullapi.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(path = "/register")
    public String saveUser(@RequestBody UserDto userDto){
        String id = userService.addUser(userDto);
        return id;
    }

}
