package com.will.example.spring.jiemi.ch4;

import org.springframework.beans.factory.annotation.Required;

public class ReadSytemInitValueBean {

    private OuterBean outerBean;

    public void init() {
        String property = System.getProperty(SysPropertyIniter.SYSTEM_INIT_KEY);
        System.out.printf(property);
    }

    public OuterBean getOuterBean() {
        return outerBean;
    }

    @Required
    public void setOuterBean(OuterBean outerBean) {
        this.outerBean = outerBean;
    }
}
