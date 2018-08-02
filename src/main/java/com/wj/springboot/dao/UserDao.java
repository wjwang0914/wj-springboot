package com.wj.springboot.dao;

import com.wj.springboot.model.User;

import java.util.List;

/**
 * 使用jdbc方式
 */
public interface UserDao {

    List<User> listUser();

    String addUser(User user);
}
