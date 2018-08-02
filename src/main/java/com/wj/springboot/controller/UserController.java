package com.wj.springboot.controller;

import com.wj.springboot.model.User;
import com.wj.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("listUser")
    public List<User> listUser() {
        return userService.listUser();
    }

    @RequestMapping("listUserByMapper")
    public List<User> listUserByMapper() {
        return userService.listUserByMapper();
        //throw new RuntimeException("全局异常测试");
    }

    @RequestMapping("addUser")
    public User addUser(@Valid User user) {
        userService.addUser(user);
        return user;
    }

    @RequestMapping("log")
    public String log() {
        log.info("使用@slf4j注解输出日志");
        return "success";
    }
}
