package com.yue.first.mapper;

import com.yue.first.bean.CompanyEntity;

public interface EmployeeInfoDao {
    void save(CompanyEntity employee);
    void update(CompanyEntity employee);
    void delete(CompanyEntity employee);
    CompanyEntity findByEmployeeId(Integer id);
}
