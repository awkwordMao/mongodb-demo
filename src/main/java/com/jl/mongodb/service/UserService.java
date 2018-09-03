package com.jl.mongodb.service;

import com.jl.mongodb.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

    void save(User user);

    User findByName(String name);
}
