package com.togethair.service;

import com.togethair.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Iterable<User> getAllUsers();
}
