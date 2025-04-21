package com.example.mdp_1.service;

import com.example.mdp_1.model.ClothesDto;

import java.util.List;

public interface ClothesService {
    List<ClothesDto> findAllClothes();
    void deleteClothes(Long id);
}
