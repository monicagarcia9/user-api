package io.monica.userapi.controllers;

import io.monica.userapi.models.User;
import io.monica.userapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@AllArgsConstructor
@RestController
public class UserController {

    private UserService userService;

    @GetMapping("/users/{id}")
    public Optional<User> findUserById(@PathVariable String id){
        return userService.findById(id);
    }

}
