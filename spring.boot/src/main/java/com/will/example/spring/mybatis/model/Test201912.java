package com.will.example.spring.mybatis.model;

/**
 * Created by will on 20/1/22.
 */
public class Test201912 {

    private int id;

    private String scene;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    @Override
    public String toString() {
        return "Test201912{" +
                "id=" + id +
                ", scene='" + scene + '\'' +
                '}';
    }
}
