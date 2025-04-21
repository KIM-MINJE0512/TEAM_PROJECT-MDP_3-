package com.example.mdp_1.controller;

import com.example.mdp_1.model.UserDto;
import com.example.mdp_1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Delete;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    // 등록
    @PostMapping("/signIn")
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto){
        userService.insertUser(userDto);
        return ResponseEntity.ok("등록되었습니다");
    }
    // 삭제
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return ResponseEntity.ok("삭제되었습니다");
    }


}
