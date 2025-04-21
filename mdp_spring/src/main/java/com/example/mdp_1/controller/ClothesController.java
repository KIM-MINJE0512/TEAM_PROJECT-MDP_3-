package com.example.mdp_1.controller;

import com.example.mdp_1.model.ClothesDto;
import com.example.mdp_1.service.ClothesService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Select;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ClothesController {
    private final ClothesService clothesService;

    @GetMapping("/find")
    public ResponseEntity<?> findAllCLothes(){
        List<ClothesDto> allClothes = clothesService.findAllClothes();
        return ResponseEntity.ok(allClothes);
    }

    @DeleteMapping("/delclothes/{id}")
    public ResponseEntity<?> deleteClothes(@PathVariable("id") Long id){
        clothesService.deleteClothes(id);
        return ResponseEntity.ok("삭제되었습니다");
    }
}
