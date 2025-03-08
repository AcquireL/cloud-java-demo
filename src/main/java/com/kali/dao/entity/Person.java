package com.kali.dao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private Long id;
    private String name;
    private int age;

    // 公共的构造方法
    public Person() {}

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("person_name")  // 如果你希望JSON字段有特定的名称
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
