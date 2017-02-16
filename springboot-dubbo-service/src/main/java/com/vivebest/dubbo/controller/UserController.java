package com.vivebest.dubbo.controller;

import com.vivebest.dubbo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.UserResponse;

/**
 * Created by clear on 2017/2/16.
 */
@RestController
@RequestMapping("/dubbo")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("select")
    public UserResponse selectUserByName(String name){
        return userService.queryByname(name);
    }
}
