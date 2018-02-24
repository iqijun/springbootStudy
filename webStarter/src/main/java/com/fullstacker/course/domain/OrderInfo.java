package com.fullstacker.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by 戴宪锁 on 2017/5/22.
 * 实体类 对应数据库 t_orderinfo 表
 * 订单详情类
 */
@Entity
public class OrderInfo {
    @Id
    @GeneratedValue
    private Long id;
    private Integer info_id;
    private Integer o_id;
    private String g_code;
    private Integer info_amount;
    private Double info_pirce;
    private Timestamp info_time;

    public OrderInfo() {
    }

    public OrderInfo(Integer o_id, String g_code, Integer info_amount, Double info_pirce, Timestamp info_time) {
        this.o_id = o_id;
        this.g_code = g_code;
        this.info_amount = info_amount;
        this.info_pirce = info_pirce;
        this.info_time = info_time;
    }

    public Integer getInfo_id() {
        return info_id;
    }

    public void setInfo_id(Integer info_id) {
        this.info_id = info_id;
    }

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public String getG_code() {
        return g_code;
    }

    public void setG_code(String g_code) {
        this.g_code = g_code;
    }

    public Integer getInfo_amount() {
        return info_amount;
    }

    public void setInfo_amount(Integer info_amount) {
        this.info_amount = info_amount;
    }

    public Double getInfo_pirce() {
        return info_pirce;
    }

    public void setInfo_pirce(Double info_pirce) {
        this.info_pirce = info_pirce;
    }

    public Timestamp getInfo_time() {
        return info_time;
    }

    public void setInfo_time(Timestamp info_time) {
        this.info_time = info_time;
    }

    @Override
    public String toString() {
        return "OrderInfoService{" +
                "info_id=" + info_id +
                ", o_id=" + o_id +
                ", g_code='" + g_code + '\'' +
                ", info_amount=" + info_amount +
                ", info_pirce=" + info_pirce +
                ", info_time=" + info_time +
                '}';
    }
}
