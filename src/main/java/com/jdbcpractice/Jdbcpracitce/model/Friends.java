package com.jdbcpractice.Jdbcpracitce.model;

public class Friends {          //this class is for mapping with the table inside our database
    String name;                //so for mapping the fields inside this class should be same as the columns
    String address;             //inside the table of database
    String mobno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }
}
