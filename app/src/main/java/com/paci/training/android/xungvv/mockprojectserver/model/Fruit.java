package com.paci.training.android.xungvv.mockprojectserver.model;

public class Fruit {
    private final int id;
    private final String name;
    private final String detail;
    public Fruit(int id, String name, String detail){
        this.id = id;
        this.name = name;
        this.detail = detail;
    }

    public String getName(){
        return name;
    }
    public String getDetail(){
        return detail;
    }

    public int getId(){
        return id;
    }
}
