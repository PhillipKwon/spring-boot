package com.example.demo.board;

import com.example.demo.DemoApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)

public class BoardMapperTest {

    @Autowired
    BoardMapper mapper;

    @Test
    public void 게시판추가(){
        Board board = new Board();

        board.setTitle("제목TEST");
        board.setContent("게시판내용");

        mapper.insert(board);
        
    }
    
}