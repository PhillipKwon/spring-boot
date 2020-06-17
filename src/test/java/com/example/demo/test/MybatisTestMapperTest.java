package com.example.demo.test;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
    classes = DemoApplication.class
)

class MybatisTestMapperTest {

    @Autowired
    MybatisTestMapper mapper;

    @Test
    public void mybatisconnectionTest(){

        System.out.println(mapper.getDate()+" // test complete!");

    }

}