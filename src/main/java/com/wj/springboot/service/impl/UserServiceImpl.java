package com.wj.springboot.service.impl;

import com.wj.springboot.dao.UserDao;
import com.wj.springboot.mapper.UserMapper;
import com.wj.springboot.model.User;
import com.wj.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//jdbc
    @Autowired
    private UserMapper userMapper;//mybatis

    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }

    @Override
    public List<User> listUserByMapper() {
        return userMapper.listUserByMapper();
    }

    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }
}
