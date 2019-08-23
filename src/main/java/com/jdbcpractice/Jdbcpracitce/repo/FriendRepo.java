package com.jdbcpractice.Jdbcpracitce.repo;

import com.jdbcpractice.Jdbcpracitce.model.Friends;
import com.sun.scenario.effect.Offset;

import java.util.List;

public interface FriendRepo {
    List<Friends> getFriends();         //here we want all the records from the table so we are giving the list as a parameter
    Friends getFriend(String name);     //here we are giving a string called name as a parameter cuz we need it for the sql query
    String insertData(Friends friends);  //and here we are giving object as a parameter cuz we are inserting the values in the object
                                        //and inside the object means inside the table
}
