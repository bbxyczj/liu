package com.laoliu.web.controller;

import com.laoliu.domain.dto.User;
import com.laoliu.service.UserService;
import com.laoliu.web.exception.LaoLiuException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author zhengliu
 * @createTime 2018/11/12
 */
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public User login(String name,String password){
        User user = userService.getByName(name);
        if (user==null){
            throw new LaoLiuException("查无此人");
        }
        if(!password.equals(user.getPassword())){
            throw new LaoLiuException("密码错误");
        }
        return user;
    }
}
