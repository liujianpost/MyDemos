package com.liujian.persist.controller;

import com.liujian.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/persist")
@RestController
public class Controller {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/do")
    public String persist() {
        return userService.findByUserId(1).toString();
    }
}
