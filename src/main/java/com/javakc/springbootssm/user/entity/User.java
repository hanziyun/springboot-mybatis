package com.javakc.springbootssm.user.entity;

import lombok.Data;

import java.util.Date;


@Data
public class User {
    private int id;
    private String name;
    private int age;
    private int gender;
    private String phone;
    private Date birthday;
    private String address;
}
