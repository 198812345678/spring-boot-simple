package com.will.example.spring.jiemi.ch4;

import com.will.example.spring.jiemi.FXNewsProvider;

import java.util.List;
import java.util.Map;

public class MapFieldBean {

    private Map<String, String> strMapStr;

    private Map<OuterBean, FXNewsProvider> outerBeanFXNewsProviderMap;

    private Map<String, List<String>> stringListMap;

    public Map<String, String> getStrMapStr() {
        return strMapStr;
    }

    public void setStrMapStr(Map<String, String> strMapStr) {
        this.strMapStr = strMapStr;
    }

    public Map<OuterBean, FXNewsProvider> getOuterBeanFXNewsProviderMap() {
        return outerBeanFXNewsProviderMap;
    }

    public void setOuterBeanFXNewsProviderMap(Map<OuterBean, FXNewsProvider> outerBeanFXNewsProviderMap) {
        this.outerBeanFXNewsProviderMap = outerBeanFXNewsProviderMap;
    }

    public Map<String, List<String>> getStringListMap() {
        return stringListMap;
    }

    public void setStringListMap(Map<String, List<String>> stringListMap) {
        this.stringListMap = stringListMap;
    }
}
