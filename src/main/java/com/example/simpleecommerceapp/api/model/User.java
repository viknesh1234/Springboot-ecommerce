package com.example.simpleecommerceapp.api.model;

public class User {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public User(Integer id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Integer getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }


}
