package com.fullstacker.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 戴宪锁 on 2017/5/22.
 * 实体类 对应数据库 t_goods 表
 * 商品类
 */
@Entity
public class Goods {
    @Id
    @GeneratedValue
    private Long id;
    private Integer g_id;
    private Integer type_id;
    private String g_code;              // 商品条码
    private String g_name;
    private double pirce;
    private Integer amount;

    public Goods() {
    }

    public Goods(Integer type_id, String g_code, String g_name, double pirce, Integer amount) {
        this.type_id = type_id;
        this.g_code = g_code;
        this.g_name = g_name;
        this.pirce = pirce;
        this.amount = amount;
    }

    public Goods(Integer g_id, Integer type_id, String g_code, String g_name, double pirce, Integer amount) {
        this.g_id = g_id;
        this.type_id = type_id;
        this.g_code = g_code;
        this.g_name = g_name;
        this.pirce = pirce;
        this.amount = amount;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getG_code() {
        return g_code;
    }

    public void setG_code(String g_code) {
        this.g_code = g_code;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public double getPirce() {
        return pirce;
    }

    public void setPirce(double pirce) {
        this.pirce = pirce;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "g_id=" + g_id +
                ", type_id=" + type_id +
                ", g_code='" + g_code + '\'' +
                ", g_name='" + g_name + '\'' +
                ", pirce=" + pirce +
                ", amount=" + amount +
                '}';
    }
}
