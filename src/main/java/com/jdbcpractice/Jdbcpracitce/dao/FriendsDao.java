package com.jdbcpractice.Jdbcpracitce.dao;

import com.jdbcpractice.Jdbcpracitce.model.Friends;
import com.jdbcpractice.Jdbcpracitce.repo.FriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FriendsDao implements FriendRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Friends> getFriends() {
      List<Friends> list=jdbcTemplate.query("select * from Friends;",new BeanPropertyRowMapper<>(Friends.class));
        return list;
    }

    @Override
    public Friends getFriend(String name) {
        Friends friends=jdbcTemplate.queryForObject("select * from Friends where name = ?",new Object[]{name},new BeanPropertyRowMapper<>(Friends.class));
        return friends;
    }

    @Override
    public String insertData(Friends friends) {
        jdbcTemplate.update("insert into Friends values(?,?,?)",new Object[]{friends.getName(),friends.getAddress(),friends.getMobno()});
        return "Data saved";
    }
}
