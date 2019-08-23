package com.jdbcpractice.Jdbcpracitce.controller;

import com.jdbcpractice.Jdbcpracitce.dao.FriendsDao;
import com.jdbcpractice.Jdbcpracitce.model.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {

    @Autowired
    FriendsDao friendsDao;

    @GetMapping(value = "/getdata")
    public List<Friends> getFriends(){
        List<Friends> list=friendsDao.getFriends();
        return list;
    }

    @GetMapping(value = "/getdata/{name}")
    public Friends getFriend(@PathVariable String name){    // this annotation is used to take value from user
        Friends friend=friendsDao.getFriend(name);      //which is going to be appended with url and here the value is name
        return friend;          // for multiple parameters we need multiple @PathVariable annotations cuz one is used only for one value/parameter
    }

    @PostMapping(value = "/savedata")
    public String saveData(@RequestBody Friends friends){   //@RequestBody is used
        String str=friendsDao.insertData(friends);
        return str;
    }
}
