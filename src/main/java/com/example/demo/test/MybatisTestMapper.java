package com.example.demo.test;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MybatisTestMapper {

    @Select("SELECT CURDATE()")
    public String getDate();
    
}