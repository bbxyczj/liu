package com.laoliu.service;

import com.laoliu.domain.dto.User;

/**
 * @author zhengliu
 * @createTime 2018/11/12
 */
public interface UserService {
    User getByName(String name);
}
