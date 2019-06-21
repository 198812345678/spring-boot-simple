package com.will.example.spring.jiemi.ch4;

public class OuterBean {

    private InnerBean innerBean;

    public InnerBean getInnerBean() {
        return innerBean;
    }

    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }
}
