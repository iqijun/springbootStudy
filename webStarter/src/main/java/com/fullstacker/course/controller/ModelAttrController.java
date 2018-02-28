package com.fullstacker.course.controller;

import com.fullstacker.course.domain.User;
import com.fullstacker.course.domain.UserDetail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * modelAttribute注解测试
 *
 * @author xingguishuai
 * @create 2018-02-24-14:01
 **/
@Controller
@RequestMapping("modelAttr")
public class ModelAttrController {

    private  String page_prefix = "modelAttr/";

    /**
    * <p>功能描述：在方法上增加ModelAttribute注解，则该controller中所有的请求都会添加上该方法中model的值</p>
    * @return
    * @author xingguishuai
    * @Date 2018-02-24 15:26
    * @since 1.0
    */
    @ModelAttribute
    public void allModelAttr(UserDetail ud){
        ud.setAddress("北京");
        ud.setHobby("code");
    }

    /**
    * <p>功能描述：测试页面中可以直接使用${user.属性}获取user对象的值，不需使用model.addAttribute方法添加属性 </p>
     * <p>
     *     这种写法相当于：
     *      public  String noAttPage(User user){...}
     * </p>
    * @return
    * @author xingguishuai
    * @Date 2018-02-24 14:45
    * @since 1.0
    */
    @RequestMapping("noAttr")
    public  String noAttPage(@ModelAttribute User user){
        user.setId(1000L);
        user.setAge(10);
        user.setName("Json");
        return page_prefix + "noAttr";
    }


    /**
    * <p>功能描述：使用ModelAttribute更改key的值 此例将key值改为attrName</p>
    * @return
    * @author xingguishuai
    * @Date 2018-02-24 15:22
    * @since 1.0
    */
    @RequestMapping("modelAttr")
    public  String modelAttrPage(@ModelAttribute("attrName") User user){
        user.setId(1000L);
        user.setAge(10);
        user.setName("Json");
        return page_prefix + "modelAttr";
    }

}
