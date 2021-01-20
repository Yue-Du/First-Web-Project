package com.yue.first.service;

import com.yue.first.bean.CompanyEntity;

public interface EmployeeInfoService {
    void save(CompanyEntity employee);
    void update(CompanyEntity stock);
    void delete(CompanyEntity stock);
    CompanyEntity findByEmployeeId(Integer id);
}
