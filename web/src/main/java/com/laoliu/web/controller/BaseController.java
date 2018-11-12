package com.laoliu.web.controller;


import com.alibaba.fastjson.JSON;
import com.laoliu.web.exception.LaoLiuException;
import com.laoliu.web.result.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * linggan on 2018/6/27
 */
@ControllerAdvice
public class BaseController {

    private static final Logger log= LogManager.getLogger(BaseController.class);
    /**
     * 基于@ExceptionHandler异常处理
     */
    @ExceptionHandler
    public void exception(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        String url = request.getRequestURI();
        Map param = request.getParameterMap();
        response.reset();
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            if (ex instanceof LaoLiuException) {
                log.warn("Method[业务异常]请求url:{}，参数：{}，异常信息：{}", url, param, ((LaoLiuException) ex).getMsg(), ex);
                response.getWriter().print(JSON.toJSONString(new Result("400",((LaoLiuException) ex).getMsg())));
                response.flushBuffer();
                return;
            }
            log.warn("Method[系统异常]请求url:{}，参数：{}，异常信息：{}", url, param, ex.getMessage(), ex);
            response.getWriter().print(JSON.toJSONString(new Result<>("系统异常")));
            response.flushBuffer();
        } catch (IOException e) {
            log.error("Method[exception]", e);
        }
    }


}
