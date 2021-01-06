package com.yue.first.mapper;
import com.yue.first.bean.CompanyEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

@Service("employeeinfoDao")
public class EmployeeInfoDaoImpl extends CustomHibernateDaoSupport implements EmployeeInfoDao{

    public void save(CompanyEntity employee){
        getHibernateTemplate().save(employee);
    }

    public void update(CompanyEntity employee){
        getHibernateTemplate().update(employee);
    }

    public void delete(CompanyEntity employee){
        getHibernateTemplate().delete(employee);
    }

    public CompanyEntity findByEmployeeId(String id){
        List list = getHibernateTemplate().find(
                "from CompanyEntity where id=?",id
        );
        return (CompanyEntity)list.get(0);
    }
}
