package com.wj.springboot.service;

import com.wj.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> listUser();

    List<User> listUserByMapper();

    String addUser(User user);
}
