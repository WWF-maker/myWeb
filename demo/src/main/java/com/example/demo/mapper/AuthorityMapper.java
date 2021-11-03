package com.example.demo.mapper;

import com.example.demo.model.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface AuthorityMapper {
    public List<UserPo> getAllUserPos();
}
