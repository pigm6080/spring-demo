package com.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public UserDto test(){

        UserDto userdto = new UserDto();
        userdto.setAge(20);
        userdto.setName("hoon");

        return userdto;
    }


}
