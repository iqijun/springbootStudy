package com.fullstacker.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 戴宪锁 on 2017/5/22.
 * 实体类 对应数据库 t_employee 表
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private Integer e_id;
    private String e_account;
    private String e_password;
    private String e_nickName;

    public Employee() {
    }

    public Employee(String e_account, String e_password, String e_nickName) {
        this.e_account = e_account;
        this.e_password = e_password;
        this.e_nickName = e_nickName;
    }

    public Employee(Integer e_id, String e_account, String e_password, String e_nickName) {
        this.e_id = e_id;
        this.e_account = e_account;
        this.e_password = e_password;
        this.e_nickName = e_nickName;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_account() {
        return e_account;
    }

    public void setE_account(String e_account) {
        this.e_account = e_account;
    }

    public String getE_password() {
        return e_password;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password;
    }

    public String getE_nickName() {
        return e_nickName;
    }

    public void setE_nickName(String e_nickName) {
        this.e_nickName = e_nickName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_account='" + e_account + '\'' +
                ", e_password='" + e_password + '\'' +
                ", e_nickName='" + e_nickName + '\'' +
                '}';
    }
}
