package com.fullstacker.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/8.
 *
 * ThymeLeaf相关
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeLeafController {

    private String page_pre = "/static/";
    @RequestMapping("hello")
    public  String helloThymLeaf(ModelMap map){
        map.addAttribute("message","我的博客：www.full-stacker.com");
        return "hello";
    }
    @RequestMapping("")
    public  String index(ModelMap map){
        map.addAttribute("message","我的博客：www.full-stacker.com");
        return "index";
    }

    @RequestMapping("home")
    public  String home(ModelMap map){
        map.addAttribute("message","我的博客：www.full-stacker.com");
        return "home";
    }
}
