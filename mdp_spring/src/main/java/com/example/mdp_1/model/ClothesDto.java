package com.example.mdp_1.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter

public class ClothesDto {
    private Long id;                 // 옷 고유 아이디
    private Long userId;            // 사용자 고유 아이디 (외래키)
    private String clColor;         // 옷 컬러
    private String clType;          // 옷 종류
    private Integer clStatus;       // 옷 상태
    private String clInfo;          // 옷 정보
    private String clName;          // 옷 이름
    private LocalDateTime createdDt;// 생성일
    private LocalDateTime updatedDt;// 수정일
}
