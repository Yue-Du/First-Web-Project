package com.yue.first.service;

import com.yue.first.bean.PersonInfoDO;
import com.yue.first.bean.PersonalInfoBO;
import com.yue.first.mapper.PersonInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonInfoService {
    @Resource
    private PersonInfoMapper personInfoMapper;

    public PersonalInfoBO getPersonInfoById(long id){
        return PersonalInfoBO.createPersonInfoBO(personInfoMapper.getPersonInfoById(id));
    }
    public int insertPersonInfo(PersonalInfoBO personalInfoBO){
        return personInfoMapper.insertPersonInfo(PersonInfoDO.createPersonInfoDO(personalInfoBO));
    }
}
