package com.vivebest.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.vivebest.dubbo.api.DubboUserService;
import com.vivebest.dubbo.dao.UserMapper;
import com.vivebest.dubbo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import vo.UserResponse;

/**
 * Created by clear on 2017/2/14.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements DubboUserService{
    @Autowired
    private UserMapper userDao;
    @Override
    public String getString() {
        return "zhuxiongwei";
    }

    @Override
    @Transactional(readOnly = true)
    public UserResponse queryByname(String name) {
        User user = userDao.findByName(name);
        UserResponse response = new UserResponse();
        response.setName(user.getUsername());
        response.setId(user.getId());
        response.setEmail(user.getEmail());
        return response;
    }
}
