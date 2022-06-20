package com.example.exmaple_03.test;

import com.example.exmaple_03.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestClass {
    @Autowired
    private TestService testService;

    //testService의 save()호출
    //호출 후 리턴값을 print
    @Test
    public void saveTest(){
      Long testResult =  testService.save();
        System.out.println("testResult = " + testResult);
    }
}
