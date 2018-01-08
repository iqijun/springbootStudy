package com.fullstacker.course.dao;

import com.fullstacker.course.domain.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 多表关联查询示例
 * Created by Administrator on 2018/1/6.
 */

public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {

    @Query("select u.name as name, u.email as email, d.address as address , " +
            "d.hobby as hobby " +
            "from User u , UserDetail d " +
            "where u.id=d.userId  and  d.hobby = ?1 ")
    List<UserInfo> findUserInfo(String hobby);
}
