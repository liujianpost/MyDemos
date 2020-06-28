package com.liujian.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/security")
@RestController
public class SecurityController {

    @RequestMapping(value = "/hello")
    public String persist() {
        return "security/hello";
    }
}
