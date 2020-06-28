package com.liujian.service.service;

import com.liujian.service.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User findByUserId(Integer id);

    List<User> findUserBySex(String sex);
}
