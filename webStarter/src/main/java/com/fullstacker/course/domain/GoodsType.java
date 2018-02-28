package com.fullstacker.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 戴宪锁 on 2017/5/22.
 * 实体类 对应数据库 t_goodstype 表
 */
@Entity
public class GoodsType {
    @Id
    @GeneratedValue
    private Long id;
    private Integer type_id;
    private String type_nickName;

    public GoodsType() {
    }

    public GoodsType(String type_nickName) {
        this.type_nickName = type_nickName;
    }

    public GoodsType(Integer type_id, String type_nickName) {
        this.type_id = type_id;
        this.type_nickName = type_nickName;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_nickName() {
        return type_nickName;
    }

    public void setType_nickName(String type_nickName) {
        this.type_nickName = type_nickName;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "type_id=" + type_id +
                ", type_nickName='" + type_nickName + '\'' +
                '}';
    }
}
