package com.togethair.restcontroller;

import com.sun.istack.NotNull;
import com.togethair.model.Flight;
import com.togethair.model.User;
import com.togethair.service.UserService;
import org.springframework.web.bind.annotation.*;

// need controller for users then we are able to assign tickets
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {

    private UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(value = {"/users"})
    public @NotNull
    Iterable<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(value = {"/addUser"})
    public User addUser(@RequestBody User user) { return userService.save(user);
    }
}
