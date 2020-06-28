package com.liujian.service.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private Integer userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private String sex;

    @Column(name = "phone")
    private String phone;
}
