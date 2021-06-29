package com.example.chat.service;

import com.example.chat.entity.User;

public interface RoomService {

    //添加新用户
    boolean addUser(String roomId,User user);
}
