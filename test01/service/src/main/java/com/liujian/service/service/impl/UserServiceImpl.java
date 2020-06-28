package com.liujian.service.service.impl;

import com.liujian.service.po.User;
import com.liujian.service.repository.UserRepository;
import com.liujian.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public User findByUserId(Integer id) {
        return userRepository.findByUserId(id);
    }

    @Override
    public List<User> findUserBySex(String sex) {
        return userRepository.findUserBySex(sex);
    }
}
