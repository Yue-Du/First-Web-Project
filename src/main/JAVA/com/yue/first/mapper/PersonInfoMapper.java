package com.yue.first.mapper;

import com.yue.first.bean.PersonInfoDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInfoMapper {
    PersonInfoDO getPersonInfoById(long id);
    int insertPersonInfo(@Param("personInfoDO") PersonInfoDO personInfoDO);
}
