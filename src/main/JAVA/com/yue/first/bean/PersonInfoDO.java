package com.yue.first.bean;


public class PersonInfoDO {
    long id;
    String name;
    short gender;
    short age;

    public static PersonInfoDO createPersonInfoDO(PersonalInfoBO personalInfoBO){
        PersonInfoDO personInfoDO = new PersonInfoDO();
        personInfoDO.setName(personalInfoBO.getName());
        personInfoDO.setGender(personalInfoBO.getGender());
        personInfoDO.setAge(personalInfoBO.getAge());
        return personInfoDO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
