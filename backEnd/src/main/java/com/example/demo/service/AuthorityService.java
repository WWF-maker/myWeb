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
    public String login(UserPo user)
    {
        String pwd=authorityMapper.getPasswordByUserName(user.getNickname());
        if(pwd.equals(user.getPassword()))
            return "登陆成功";
        else
            return "登陆失败,密码错误";
    }
}
