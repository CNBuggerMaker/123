package com.example.chat.entity;

import java.util.List;

public class Room {

    String roomId;

    String roomName;

    List<User> userList;

    public Room(String roomId, String roomName, List<User> userList) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.userList = userList;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", userList=" + userList +
                '}';
    }
}
