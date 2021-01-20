package com.yue.first.mapper;

import org.springframework.orm.hibernate4.HibernateTemplate;

import javax.annotation.Resource;

public class HibernateBaseDao {

    @Resource
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
}