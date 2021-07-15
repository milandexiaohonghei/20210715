package com.example.mybatisee.dao;

import com.example.mybatisee.model.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    void addUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("孙悟空");
        userInfo.setPassword("吃一棒");
        int result = userInfoMapper.addUser(userInfo);
        System.out.println(result);
    }
}