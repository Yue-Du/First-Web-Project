package com.yue.first.service;

import com.yue.first.bean.CompanyEntity;

public interface EmployeeInfoService {
    void save(CompanyEntity employee);
    void update(CompanyEntity employee);
    void delete(CompanyEntity employee);
    CompanyEntity findByEmployeeId(Integer id);
}
