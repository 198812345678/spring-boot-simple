package com.will.example.spring.jiemi.ch4;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ListFieldBean {

    private String[] arrayList;

    private List<String> stringList;

    private Collection<String> stringCollection;

    private Set<String> stringSet;

    public String[] getArrayList() {
        return arrayList;
    }

    public void setArrayList(String[] arrayList) {
        this.arrayList = arrayList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Collection<String> getStringCollection() {
        return stringCollection;
    }

    public void setStringCollection(Collection<String> stringCollection) {
        this.stringCollection = stringCollection;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }
}
