package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.transaction.annotation.Transactional;

public class CustomerDAO extends BaseHibernateDAO implements ICustomerDAO {

    public void save(Customer transientInstance) {
        System.out.println("execute --save()-- method.");
        try {
            Transaction tx = getSession().beginTransaction();
            getSession().save(transientInstance);
            tx.commit();
        } catch (RuntimeException re) {
            throw re;
        }
    }
    public void delete(Customer transientInstance) {
        System.out.println("execute --delete()-- method.");
        try {
            getSession().delete(transientInstance);
        } catch (RuntimeException re) {
            throw re;
        }
    }
    public void update(Customer transientInstance) {
        System.out.println("execute --update()-- method.");
        try {
            getSession().update(transientInstance);
        } catch (RuntimeException re) {
            throw re;
        }
    }
    public void findByHQL(String hql) {
        System.out.println("execute --findByHQL()-- method.");
    }
}
