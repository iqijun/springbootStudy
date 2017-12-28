package com.fullstacker.course;

import com.fullstacker.course.domain.ApplicationProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * properties赋值测试
 *
 * @author xingguishuai
 * @create 2017-12-28-11:20
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyTest {

    @Autowired
    private ApplicationProperty p;

    @Test
    public void propertyValue(){
        System.out.println("==================="+p.getAppplicationNam());
    }
}
