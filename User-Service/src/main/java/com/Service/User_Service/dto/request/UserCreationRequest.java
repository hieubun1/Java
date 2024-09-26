package com.Service.User_Service.dto.request;

import jakarta.validation.constraints.Size;

public class UserCreationRequest {
    // đưa ra lõi nếu nhập username ít hơn 3 ký tự
    @Size(min = 3, message = "User must be at least 3 Character")
    private String username;

    private String firstName;
    private String lastName;
    // đưa ra lỗi nếu nhập password ít hơn 8 ký tự
    @Size(min = 8, message = "Password must be at least 8 Character")
    private String password;
    private String dob;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
