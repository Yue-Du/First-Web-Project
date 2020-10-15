package com.yue.first.bean;

public class PersonalInfoBO {
    String name;
    short gender;
    short age;

    public static PersonalInfoBO createPersonInfoBO(PersonInfoDO personalInfoDO){
        PersonalInfoBO personInfoBO = new PersonalInfoBO();
        personInfoBO.setName(personalInfoDO.getName());
        personInfoBO.setGender(personalInfoDO.getGender());
        personInfoBO.setAge(personalInfoDO.getAge());
        return personInfoBO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}


