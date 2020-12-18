package com.yue.first.bean;

import javax.persistence.*;
@Entity
@Table(name = "company")
public class EmployeeInfoDO {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "age")
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
