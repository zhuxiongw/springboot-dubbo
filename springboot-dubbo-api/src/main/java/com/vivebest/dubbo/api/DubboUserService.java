package com.vivebest.dubbo.api;

import vo.UserResponse;

/**
 * Created by clear on 2017/2/14.
 */
public interface DubboUserService {
    String getString();

    UserResponse queryByname(String name);
}
