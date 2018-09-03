package com.jl.mongodb.controller;

import com.jl.mongodb.model.User;
import com.jl.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @Autowired
//    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public User save(){
        User user = new User();
        user.setId("1");
        user.setName("maomao");
        user.setAge("12");
        mongoTemplate.save(user);
        return user;
    }
}
