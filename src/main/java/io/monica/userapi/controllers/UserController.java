package io.monica.userapi.controllers;

import io.monica.userapi.models.User;
import io.monica.userapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping
@AllArgsConstructor
@RestController
public class UserController {

    private UserService userService;

    @GetMapping("/users/{id}")
    public Optional<User> findUserById(@PathVariable String id) {
        return userService.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable String id){
        userService.deleteById(id);
    }
    @GetMapping("/users")
    public Iterable<User> findAllUsers() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.edit(user);
    }

}
