package com.fullstacker.course.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * properties测试
 *
 * @author xingguishuai
 * @create 2017-12-27-18:58
 **/
@Component
public class ApplicationProperty {

    @Value("${appplicationName}")
    private String appplicationNam;

    public String getAppplicationNam() {
        return appplicationNam;
    }

    public void setAppplicationNam(String appplicationNam) {
        this.appplicationNam = appplicationNam;
    }
}
