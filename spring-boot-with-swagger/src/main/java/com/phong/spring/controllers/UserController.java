package com.phong.spring.controllers;

import com.phong.spring.entities.User;
import com.phong.spring.repositories.UserRepository;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Api(value = "User APIs")
public class UserController {
    private final UserRepository userRepository;
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAll(){
        return userRepository.findAll();
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id){
        return userRepository.findById(id).orElse(new User());
    }
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User createUser(@Validated @RequestBody User user){
        return userRepository.save(user);
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.POST)
    public User updateUser(@PathVariable("id") Long id, @Validated @RequestBody User user){
        user.setId(id);
        return userRepository.save(user);
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    }
}
