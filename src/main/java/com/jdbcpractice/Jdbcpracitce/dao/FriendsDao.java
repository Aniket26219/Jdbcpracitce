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
    public List<Friends> getFriends() {                         // this all are the implemented methods of FriendRepo interface
        List<Friends> list=jdbcTemplate.query("select * from Friends",
                new BeanPropertyRowMapper<>(Friends.class));        //Frineds.class is the mapping class or we can say
        return list;                    //it is the table of our database
    }

    @Override
    public Friends getFriend(String name) {
        Friends friend=jdbcTemplate.queryForObject("select * from Friends where name = ?",
                new Object[]{name},new BeanPropertyRowMapper<>(Friends.class));   //the parameter of Object should be same as
        return friend;                          // the parameter of in the method
    }

    @Override
    public String insertData(Friends friends) {
        jdbcTemplate.update("insert into Friends values(?,?,?)",
                new Object[]{friends.getName(),friends.getAddress(),friends.getMobno()});
        return "Data Saved";
    }
}
