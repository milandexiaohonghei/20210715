package com.example.mybatisee.dao;

import com.example.mybatisee.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    //新增方法
    public int addUser(UserInfo userInfo);
}
