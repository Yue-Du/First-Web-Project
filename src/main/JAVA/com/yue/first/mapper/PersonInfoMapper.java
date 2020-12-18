package com.yue.first.mapper;

import com.yue.first.bean.PersonInfoDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInfoMapper {
    PersonInfoDO getPersonInfoById(@Param("id") long id);

    int insertPersonInfo(@Param("personInfoDO") PersonInfoDO personInfoDO);

    int updatePersonInfoById(@Param("updatePersonInfoDO") PersonInfoDO personInfoDO, @Param("id") long id);

}
