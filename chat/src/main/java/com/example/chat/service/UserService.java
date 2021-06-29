package com.example.chat.service;

import com.example.chat.entity.User;

import java.util.List;

public interface UserService {

    //查找其他用户
    List<User> findOthers(String userId);
}
