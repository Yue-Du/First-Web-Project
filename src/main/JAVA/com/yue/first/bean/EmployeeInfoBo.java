package com.yue.first.bean;
import javax.persistence.Entity;
import javax.persistence.Table;


public class EmployeeInfoBo {
    int id;
    String name;
    int age;

    public static EmployeeInfoBo createEmployeeInfoBo(EmployeeInfoDO employeeInfoDO) {
        EmployeeInfoBo employeeInfoBo = new EmployeeInfoBo();
        employeeInfoBo.setId(employeeInfoDO.getId());
        employeeInfoBo.setName(employeeInfoDO.getName());
        employeeInfoBo.setAge(employeeInfoDO.getAge());
        return employeeInfoBo;
    }
    int getId() {
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

    public String toJson() {
        return "'personalInfoBO':{" +
                "'name:'" + name +
                ", 'age':" + age +
                '}';
    }
}
