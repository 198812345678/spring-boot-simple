package com.will.example.spring.boot.spring.boot.bean;

import java.util.List;
import java.util.Map;

public class Foo20 {

    private Bar bar;

    private List<Baz> bazList;


    private Map<String, Bar> stringBarMap;

    private Map<Bar, String> barStringMap;

    private String str;

    public Foo20() {
    }

    public Foo20(Bar bar) {
        this.bar = bar;
    }

    public Foo20(Bar bar, List<Baz> bazList) {
        this.bar = bar;
        this.bazList = bazList;
    }

    public Foo20(Map<String, Bar> stringBarMap) {
        this.stringBarMap = stringBarMap;
    }
//
//    public Foo20(List<Baz> bazList) {
//        this.bazList = bazList;
//    }


//    public Foo20(List<Baz> bazList, Map<String, Bar> stringBarMap) {
//        this.bazList = bazList;
//        this.stringBarMap = stringBarMap;
//    }
//
//    public Foo20(Bar bar, List<Baz> bazList, Map<String, Bar> stringBarMap) {
//        this.bar = bar;
//        this.bazList = bazList;
//        this.stringBarMap = stringBarMap;
//    }

    public Foo20(Bar bar, List<Baz> bazList, Map<String, Bar> stringBarMap, Map<Bar, String> barStringMap) {
        this.bar = bar;
        this.bazList = bazList;
        this.stringBarMap = stringBarMap;
        this.barStringMap = barStringMap;
    }

    public void setBarStringMap(Map<Bar, String> barStringMap) {
        this.barStringMap = barStringMap;
    }

    public void setStringBarMap(Map<String, Bar> stringBarMap) {
        this.stringBarMap = stringBarMap;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void setBazList(List<Baz> bazList) {
        this.bazList = bazList;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Foo20{" +
                "bar=" + bar +
                ", bazList=" + bazList +
                ", str='" + str + '\'' +
                ", stringBarMap=" + stringBarMap +
                ", barStringMap=" + barStringMap +
                '}';
    }

}
