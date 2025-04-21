package com.example.mdp_1.service;

import com.example.mdp_1.mapper.UserMapper;
import com.example.mdp_1.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserServicImpl implements UserService{
    private final UserMapper userMapper;
    // public UserService (User Mapper userMapper){
    // this.userMapper = userMpper;
    // }


    @Override
    public void insertUser(UserDto userDto) {
        userMapper.isnertUser(userDto);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }
}
