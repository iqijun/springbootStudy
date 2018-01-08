package com.fullstacker.course.dao;


import javax.persistence.Entity;

/**
 * Created by Administrator on 2018/1/6.
 */

/**
 * 特别注意此时UserInfo类是结果集的对象不是Entity 不能添加Entity注解
 */
/*@Entity*/

public interface UserInfo {

    String getName();
    String getEmail();
    String getAddress();
    String getHobby();


}
