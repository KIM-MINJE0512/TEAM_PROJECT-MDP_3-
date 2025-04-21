package com.example.mdp_1.service;

import com.example.mdp_1.mapper.ClothesMapper;
import com.example.mdp_1.model.ClothesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClothesServiceImpl implements ClothesService{

    private final ClothesMapper clothesMapper;

    @Override
    public List<ClothesDto> findAllClothes() {
        return clothesMapper.findAllClothes();
    }

    @Override
    public void deleteClothes(Long id) {
        clothesMapper.deleteClothes(id);
    }
}
