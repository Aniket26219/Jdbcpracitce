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
    public Friends getFriend(@PathVariable String name){
        Friends f=friendsDao.getFriend(name);
        return f;
    }

    @PostMapping(value = "/savedata")
    public String saveData(@RequestBody Friends friends){
        String str=friendsDao.insertData(friends);
        return str;
    }
}
