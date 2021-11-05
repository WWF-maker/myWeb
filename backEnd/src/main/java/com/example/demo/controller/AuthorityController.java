package com.example.demo.controller;

import com.example.demo.model.UserPo;
import com.example.demo.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todolist")
public class AuthorityController {
    @Autowired
    AuthorityService authorityService;
    @GetMapping("/users")
    public List<UserPo> getUserInfo()
    {
        return authorityService.getAllUserInfo();
    }
    @PostMapping("/login")
    public String login(@RequestBody UserPo userPo)
    {
        return authorityService.login(userPo);
    }
}
