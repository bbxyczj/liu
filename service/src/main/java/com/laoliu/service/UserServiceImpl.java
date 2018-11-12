package com.laoliu.service;

import com.laoliu.domain.mapper.UserMapper;
import com.laoliu.domain.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhengliu
 * @createTime 2018/11/12
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByName(String name) {
        return userMapper.getByName(name);
    }
}
