package com.example.mdp_1.service;

import com.example.mdp_1.model.UserDto;

import java.util.List;

public interface UserService {
    void insertUser(UserDto userDto);
    void deleteUser(Long id);

}
