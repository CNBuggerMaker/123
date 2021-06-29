package com.example.chat.controller;

import com.example.chat.Intialize.Intialization;
import com.example.chat.ServiceImpl.UserServiceImpl;
import com.example.chat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @RequestMapping("/joinChat")
    public String joinRoom(String roomId, String userId, String userName){

        StringBuffer str = new StringBuffer(userName + "加入了聊天室，其他成员为");
        List<User> userList = userService.findOthers(userId);

        //进入聊天室添加用户
        HashMap<String,User> userMap = Intialization.ROOMMAP.get(roomId);
        userMap.put(userId,new User(userId,userName));
        Intialization.ROOMMAP.put(roomId,userMap);

        for (User user:userList) {
            str.append(user.getUserName());
        }

        return str.toString();
    }

    @RequestMapping("/leaveChat")
    @ResponseBody
    public String leaveRoom (String roomId, String userId, String userName){

        StringBuffer str = new StringBuffer(userName + "离开了聊天室，其他成员为");

        List<User> userList = userService.findOthers(userId);

        //离开聊天室删除用户
        HashMap<String,User> userMap = Intialization.ROOMMAP.get(roomId);
        userMap.remove(userId);
        Intialization.ROOMMAP.put(roomId,userMap);

        for (User user:userList) {
            str.append(user.getUserName());
        }
        return str.toString();

    }


}
