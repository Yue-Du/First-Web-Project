package com.yue.first.mapper;

import com.yue.first.bean.EmployeeInfoDO;

public interface EmployeeInfoDao {
    void insertPerson(EmployeeInfoDO person);

    EmployeeInfoDO getPerson(int id);
}
