package com.jdbcpractice.Jdbcpracitce.repo;

import com.jdbcpractice.Jdbcpracitce.model.Friends;

import java.util.List;

public interface FriendRepo {
    List<Friends> getFriends();
    Friends getFriend(String name);
    String insertData(Friends friends);
}
