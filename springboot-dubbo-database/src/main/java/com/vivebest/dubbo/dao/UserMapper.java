package com.vivebest.dubbo.dao;

import java.util.Map;

import com.vivebest.dubbo.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE name = #{username}")
    User findByName(@Param("username") String username);

    @Insert("INSERT INTO USER(name, email) VALUES(#{username}, #{email})")
    int insert(Map<String,Object> map);

    @Update("UPDATE USER SET name = #{username},email = #{email} WHERE id = #{id}")
    int update(Map<String,Object> map);
}

