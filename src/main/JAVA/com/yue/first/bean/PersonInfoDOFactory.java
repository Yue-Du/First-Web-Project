package com.yue.first.bean;

public class PersonInfoDOFactory {
    public static PersonInfoDO createPersonInfoDO(PersonalInfoBO personalInfoBO){
        PersonInfoDO personInfoDO = new PersonInfoDO();
        personInfoDO.setName(personalInfoBO.getName());
        personInfoDO.setGender(personalInfoBO.getGender());
        personInfoDO.setAge(personalInfoBO.getAge());
        return personInfoDO;
    }
}
