package com.codeup.springblog.models;

public class Dog {
    private int id;
    private int age;
    private String name;
    private String resideState;

    public Dog() {}

    public Dog(int age, String name, String resSt) {
        this.age = age;
        this.name = name;
    }
}
