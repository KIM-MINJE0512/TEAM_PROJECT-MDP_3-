package com.example.mdp_1.mapper;

import com.example.mdp_1.model.UserDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface UserMapper {

    // 사용자 추가
    @Insert("""
            INSERT INTO `user` (user_id, user_pwd, user_name, gender, created_dt, updated_dt)
            VALUES (#{userId}, #{userPwd}, #{userName}, #{gender}, NOW(), NOW())
            """)
    void isnertUser(UserDto userDto);

    // 사용자 삭제
    @Delete("""
            delete from `user` where id = #{id};
            """)
    void deleteUser(Long id);

}
