package com.laoliu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhengliu
 * @createTime 2018/11/12
 */
@Controller
public class IndexController {


    @RequestMapping("index")
    public String index(){
        return "login";
    }

    @RequestMapping("success")
    public String success(){
        return "success";
    }
}
