package com.fullstacker.course.dao;

import com.fullstacker.course.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/1/6.
 */

public interface UserRespository extends JpaRepository<User,Long>{

    User findByName(String userName);
    User findByNameOrEmail(String username, String email);
    List<User> findByEmailLike(String email);

    User findByNameIgnoreCase(String userName);

    List<User> findByNameOrderByEmailDesc(String email);

    @Query("select u from User u")
    Page<User> findALL(Pageable pageable);

    Page<User> findByName(String name, Pageable pageable);


    /*****************自定义sql 开始*************************/
    @Transactional(timeout = 10)
    @Modifying  /*更改，删除操作时添加Modify注解*/
    @Query("update User set userName = ?1 where id = ?2")
    int modifyById(String  userName, Long id);

    @Transactional
    @Modifying
    @Query("delete from User where id = ?1")
    void deleteById(Long id);

    @Query("select u from User u where u.email = ?1")
    User findByEmail(String email);

    /*****************自定义sql 结束*************************/
}
