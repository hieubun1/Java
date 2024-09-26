package com.Service.User_Service.controller;

import com.Service.User_Service.dto.request.UserCreationRequest;
import com.Service.User_Service.dto.request.UserUpdateRequest;
import com.Service.User_Service.entity.User;
import com.Service.User_Service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // tao user
    @PostMapping
    User createUser(@RequestBody @Valid UserCreationRequest request) {
        return userService.createUser(request);

    }
    @GetMapping
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    // lấy thông tin
    @GetMapping("/{userId}")
     User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }
    //cập nhật thông tin của một User đã tồn tại dựa trên userId
    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return "User has been deleted";
    }
}
