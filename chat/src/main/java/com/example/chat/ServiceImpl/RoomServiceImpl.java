package com.example.chat.ServiceImpl;

import com.example.chat.Intialize.Intialization;
import com.example.chat.entity.User;
import com.example.chat.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class RoomServiceImpl implements RoomService {

    //添加新用户
    public boolean addUser(String roomId,User user){

        HashMap<String,User> userMap = Intialization.ROOMMAP.get(roomId);

        userMap.put(user.getUserId(),user);

        return true;
    }
}
