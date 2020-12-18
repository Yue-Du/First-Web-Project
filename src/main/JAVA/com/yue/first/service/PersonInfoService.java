package com.yue.first.service;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.yue.first.util.IdLessThanOneException;
import com.yue.first.bean.PersonInfoDO;
import com.yue.first.bean.PersonalInfoBO;
import com.yue.first.mapper.PersonInfoMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class PersonInfoService {
    @Resource
    private PersonInfoMapper personInfoMapper;

    //@Cacheable(value = "guavaCache",key="#id")
    Cache<Long, PersonalInfoBO> cache = CacheBuilder.newBuilder().maximumSize(50).build();
    public PersonalInfoBO getPersonInfoById(long id) throws IdLessThanOneException {
        if(id < 1){
            throw new IdLessThanOneException("id must greater or equal to 0");
        }
        if(cache.getIfPresent(id) != null){
            return cache.getIfPresent(id);
        }
        PersonalInfoBO res = PersonalInfoBO.createPersonInfoBO(personInfoMapper.getPersonInfoById(id));
        cache.put(id, res);
        System.out.println("cache success");
        return res;
    }
    public int insertPersonInfo(PersonalInfoBO personalInfoBO){
        return personInfoMapper.insertPersonInfo(PersonInfoDO.createPersonInfoDO(personalInfoBO));
    }

    public int updatePersonInfoById(PersonalInfoBO personalInfoBO, long id) {
        return personInfoMapper.updatePersonInfoById(PersonInfoDO.createPersonInfoDO(personalInfoBO), id);
    }
}
