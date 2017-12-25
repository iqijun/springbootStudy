package com.fullstacker.course.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/24.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String hello(){
        System.out.println("hello  world");
        System.out.println("=======================");

        return  "hello spring-boot1213";
    }
}
