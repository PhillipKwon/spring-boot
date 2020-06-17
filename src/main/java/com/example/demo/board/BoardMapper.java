package com.example.demo.board;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BoardMapper {
    
    @Insert("INSERT INTO board(title, content) VALUES(#{title}, #{content})")
    public void insert(Board board);
    
}