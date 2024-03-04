package com.springboot.chatapp.controller;

import com.springboot.chatapp.model.Member;
import com.springboot.chatapp.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/test")
public class TestController {
    TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/Member")
    @ResponseBody
    public ResponseEntity<Member> createPost(@RequestBody Member member){
        return new ResponseEntity<Member>(testService.createMember(member), HttpStatus.CREATED);
    }
    @GetMapping("/Member")
    @ResponseBody
    public List<Member> getAllMember(){
        return testService.getAllMember();
    }
}
