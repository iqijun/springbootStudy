package com.fullstacker.course.controller;

import com.fullstacker.course.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
@RestController
public class WebController {

    @RequestMapping("/user")
    public User findUser(User user){
        user.setAge(10);
        user.setName("tomcat");
//        user.setPass("1234");
        return  user;
    }

    @RequestMapping("saveUser")
    public void saveUser(@Valid User user, BindingResult result){
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
            }
        }

    }
}
