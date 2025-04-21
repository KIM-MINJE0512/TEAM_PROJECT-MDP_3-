package com.example.mdp_1.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter

public class UserDto {
    private Long id;                  // 사용자 고유 아이디
    private String userId;           // 사용자 아이디
    private String userPwd;          // 사용자 비밀번호
    private String userName;         // 사용자 이름
    private Boolean gender;          // 성별 (0: 남자, 1: 여자)
    private LocalDateTime createdDt; // 생성일
    private LocalDateTime updatedDt; // 수정일
}
