package com.fullstacker.course.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/26.
 */
@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false,unique = true)
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @Max(value = 100,message = "年龄最大为100")
    @Min(value=10,message = "年龄最小为10")
    @Column(nullable = false,unique = true)
    private int age;

    @NotEmpty(message="密码不能为空")
    @Length(min=6,max = 18,message="密码长度不能小于 6 位不能大于18")
    @Column(nullable = false, unique = true)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }
}
