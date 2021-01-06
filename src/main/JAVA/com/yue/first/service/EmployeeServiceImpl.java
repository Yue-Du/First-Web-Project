package com.yue.first.service;

import com.yue.first.bean.CompanyEntity;
import com.yue.first.mapper.EmployeeInfoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeInfoService{
    @Autowired
    EmployeeInfoDao employeeinfoDao;

    public void setEmployeeinfoDao(EmployeeInfoDao employeeinfoDao) {
        this.employeeinfoDao = employeeinfoDao;
    }

    public void save(CompanyEntity employee){
        employeeinfoDao.save(employee);
    }

    public void update(CompanyEntity employee){
        employeeinfoDao.update(employee);
    }

    public void delete(CompanyEntity employee){
        employeeinfoDao.delete(employee);
    }

    public CompanyEntity findByEmployeeId(String id){
        return employeeinfoDao.findByEmployeeId(id);
    }
}
