package com.laoliu.domain.mapper;

import com.laoliu.domain.dto.User;

/**
 * @author zhengliu
 * @createTime 2018/11/12
 */
public interface UserMapper {

    User getByName(String name);
}
