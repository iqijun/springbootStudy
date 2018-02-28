package com.fullstacker.course.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by 戴宪锁 on 2017/5/22.
 * 实体类 对应数据库 t_order 表
 * 订单类
 */
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Integer o_id;             // 订单ID
    private Integer e_id;             // 员工ID
    private Double o_total;           // 总额
    private Timestamp e_time;

    public Order() {
    }

    public Order(Integer e_id, Double o_total, Timestamp e_time) {
        this.e_id = e_id;
        this.o_total = o_total;
        this.e_time = e_time;
    }

    public Order(Integer o_id, Integer e_id, Double o_total, Timestamp e_time) {
        this.o_id = o_id;
        this.e_id = e_id;
        this.o_total = o_total;
        this.e_time = e_time;
    }

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Double getO_total() {
        return o_total;
    }

    public void setO_total(Double o_total) {
        this.o_total = o_total;
    }

    public Timestamp getE_time() {
        return e_time;
    }

    public void setE_time(Timestamp e_time) {
        this.e_time = e_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_id=" + o_id +
                ", e_id=" + e_id +
                ", o_total=" + o_total +
                ", e_time=" + e_time +
                '}';
    }
}

