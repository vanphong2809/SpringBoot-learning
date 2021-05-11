package com.phong.spring.controllers;

import com.phong.spring.models.User;
import com.phong.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class RestApiController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id) {
        // @PathVariable lấy ra thông tin trong URL
        // dựa vào tên của thuộc tính đã định nghĩa trong ngoặc kép /users/{id}

        return userRepository.findById(id);
    }
}
