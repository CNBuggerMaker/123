package com.example.chat.Intialize;

import com.example.chat.entity.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.HashMap;

@Component
public class Intialization implements ApplicationRunner {

    public static HashMap<String, User> USERMAP = new HashMap<>();

    public static HashMap<String, HashMap<String, User>> ROOMMAP = new HashMap<>();

    @Override
    public void run(ApplicationArguments args) throws Exception{
        USERMAP.put("1",new User("1","小1"));
        USERMAP.put("2",new User("2","小2"));
        USERMAP.put("3",new User("3","小3"));
        USERMAP.put("4",new User("4","小4"));
        USERMAP.put("5",new User("5","小5"));

        ROOMMAP.put("r1",USERMAP);
    }

}
