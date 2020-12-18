package com.yue.first.mapper;

import org.springframework.orm.hibernate3.HibernateTemplate;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yue.first.bean.EmployeeInfoDO;

public class EmployeeInfoDaoImpl extends HibernateDaoSupport implements EmployeeInfoDao{

	@Override
    public void insertPerson(EmployeeInfoDO person) {
        this.getHibernateTemplate().save(person);
    }


    @Override
    public EmployeeInfoDO getPerson(int id) {
        return this.getHibernateTemplate().get(EmployeeInfoDO.class, id);
    }

}
