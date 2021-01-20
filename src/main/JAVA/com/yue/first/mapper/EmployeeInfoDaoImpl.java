package com.yue.first.mapper;

import com.yue.first.bean.CompanyEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("employeeinfoDao")
public class EmployeeInfoDaoImpl extends HibernateBaseDao implements EmployeeInfoDao {

    public void save(CompanyEntity employee) {
        Session currentSession = getHibernateTemplate().getSessionFactory().getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        getHibernateTemplate().save(employee);
        transaction.commit();
    }

    public void update(CompanyEntity employee) {
        getHibernateTemplate().update(employee);
    }

    public void delete(CompanyEntity employee) {
        getHibernateTemplate().delete(employee);
    }

    public CompanyEntity findByEmployeeId(Integer id) {
        Session currentSession = getHibernateTemplate().getSessionFactory().getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        List list = getHibernateTemplate().find(
                "from CompanyEntity where id=?", id
        );
        transaction.commit();
        if (list.isEmpty()){
            return null;
        }
        return (CompanyEntity) list.get(0);
    }
}
