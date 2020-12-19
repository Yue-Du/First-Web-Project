package com.yue.first.bean;

public class PersonInfoUpdateRequestVO {
    long id;
    PersonalInfoBO personalInfoBO;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PersonalInfoBO getPersonalInfoBO() {
        return personalInfoBO;
    }

    public void setPersonalInfoBO(PersonalInfoBO personalInfoBO) {
        this.personalInfoBO = personalInfoBO;
    }

    public String toJson() {
        String result;
        result = "{'id':" + getId() + "," + personalInfoBO.toJson() + "}";
        return result;
    }
}
