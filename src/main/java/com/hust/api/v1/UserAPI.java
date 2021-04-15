package com.hust.api.v1;

import com.hust.entity.v1.user.UserEntity;
import com.hust.service.v1.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class UserAPI {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserEntity createUser(@RequestBody UserEntity user){
        UserEntity model = userService.save(user);
        return model;
    }
}
