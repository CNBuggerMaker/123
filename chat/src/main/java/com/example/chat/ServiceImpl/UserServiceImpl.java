package com.example.chat.ServiceImpl;

import com.example.chat.Intialize.Intialization;
import com.example.chat.entity.User;
import com.example.chat.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service

public class UserServiceImpl implements UserService {

    List<User> userList = null;
    //查找其他用户
    public List<User> findOthers(String userId){

        Map<String,User> userMap = Intialization.USERMAP;

        User user = userMap.get(userId);

        userMap.remove(userId);

        userList = new ArrayList<>(userMap.values());

        userMap.put(userId,user);

        return userList;
    }
}
