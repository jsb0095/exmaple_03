package com.example.exmaple_03.controller;

import com.example.exmaple_03.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;
    @GetMapping("/")
    public String save(){
        testService.save();
        return "index";
    }
}
