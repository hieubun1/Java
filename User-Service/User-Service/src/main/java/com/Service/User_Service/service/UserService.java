package com.Service.User_Service.service;

import com.Service.User_Service.dto.request.UserCreationRequest;
import com.Service.User_Service.dto.request.UserUpdateRequest;
import com.Service.User_Service.entity.User;
import com.Service.User_Service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User createUser(UserCreationRequest request){
            User user = new User();
            // kiểm tra nếu user đã tồn tại thì in ra User exists
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("User exists");
        }

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);

    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User getUser(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
    }

    public User updateUser(String userId,UserUpdateRequest request) {
        User user = getUser(userId);
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        // lưu lại thông tin
        return userRepository.save(user);
    }

    //xóa 1 user
    public  void deleteUser(String userId) {
        userRepository.deleteById(userId);

    }
}
