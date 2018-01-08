package com.fullstacker.course.dao;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/1/6.
 */
@Entity
public interface UserInfo {

    String getName();
    String getEmail();
    String getAddress();
    String getHobby();

    void setName();
    void setEmail();
    void setAddress();
    void setHobby();

}
