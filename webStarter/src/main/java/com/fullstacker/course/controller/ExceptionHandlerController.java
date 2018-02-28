package com.fullstacker.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ExceptionHandler测试
 *
 * 另外可以在类名称上使用@ControllerAdvice注解作为全局的异常处理
 *
 * @author xingguishuai
 * @create 2018-02-27-16:35
 **/
@Controller
public class ExceptionHandlerController {

    @RequestMapping("testExceptionHandler")
    public String aTestReqest() throws Exception {
        throw new Exception("这是一个用来测试的Exception");
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model){
        System.out.println("======异常信息========"+ex.getMessage());
        model.addAttribute("message",ex.getMessage());
        return "exception";
    }
}
