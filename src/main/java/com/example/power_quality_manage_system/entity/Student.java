package com.example.power_quality_manage_system.entity;

public class Student {
    private String name;
    private int age;

    public String  getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer  getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{" +
                "Name=" + name +
                ", Age=" + age + "}";
    }
}
