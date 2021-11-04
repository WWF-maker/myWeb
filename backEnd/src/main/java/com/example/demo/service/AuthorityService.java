package com.example.demo.service;

import com.example.demo.mapper.AuthorityMapper;
import com.example.demo.model.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityService {
    @Autowired
    AuthorityMapper authorityMapper;
    public List<UserPo> getAllUserInfo(){
        return authorityMapper.getAllUserPos();
    }
}
