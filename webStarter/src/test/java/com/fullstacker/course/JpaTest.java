package com.fullstacker.course;

import com.fullstacker.course.dao.UserDetailRepository;
import com.fullstacker.course.dao.UserInfo;
import com.fullstacker.course.dao.UserRespository;
import com.fullstacker.course.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/1/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest  {

    @Autowired
    private UserRespository userRespository;

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Test
    public void testSave(){
//        User user = new User();
//        user.setName("cruise1");
//        user.setAge(18);
//        user.setEmail("xgs@foxm1ail.com");
//        user.setPassWord("x132399");
//        user.setRegTime("2010-12-20");
//        userRespository.save(user);
        User user1 = new User();
        user1.setName("cruis12e1");
        user1.setAge(11);
        user1.setEmail("xg1s@foxmcom");
        user1.setPassWord("x19399");
        user1.setRegTime("2010-12-20");
        userRespository.save(user1);
    }

    @Test
    public void testFind(){
        User cruise = userRespository.findByNameOrEmail("cruise", "xgs@foxmail.com");
        System.out.println(cruise);
    }

    @Test
    public void testPageQuery(){
        int page=0,size=10;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(page, size, sort);

        Page<User> all = userRespository.findALL(pageable);
        List<User> users = all.getContent();
        System.out.println(users.size());
        Page<User> testName = userRespository.findByName("cruise", pageable);
        List<User> content = testName.getContent();
        System.out.println(content.size());
    }

    @Test
    public  void testMutilTable(){
        List<UserInfo> all = userDetailRepository.findUserInfo("123");

    }
}
