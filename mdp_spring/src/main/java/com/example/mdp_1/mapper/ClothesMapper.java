package com.example.mdp_1.mapper;

import com.example.mdp_1.model.ClothesDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClothesMapper {
    @Select("""
            SELECT * FROM CLOTHES
            """)
    List<ClothesDto> findAllClothes();

    @Delete("""
            DELETE FROM CLOTHES WHERE ID = #{id}
            """)
    void deleteClothes(Long id);
}
