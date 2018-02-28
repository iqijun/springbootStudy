package com.fullstacker.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 戴宪锁 on 2017/5/22.
 * 实体类  对应数据库  t_admin 表
 */
@Entity
public class Admin {
    @Id
    @GeneratedValue
    private Long id;
    private Integer a_Id;
    private String account;
    private String password;
    private String nickName;

    public Admin() {
    }

    public Admin(String account, String password, String nickName) {
        this.account = account;
        this.password = password;
        this.nickName = nickName;
    }

    public Admin(Integer a_Id, String account, String password, String nickName) {
        this.a_Id = a_Id;
        this.account = account;
        this.password = password;
        this.nickName = nickName;
    }

    public Integer getA_Id() {
        return a_Id;
    }

    public void setA_Id(Integer a_Id) {
        this.a_Id = a_Id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "a_Id=" + a_Id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
