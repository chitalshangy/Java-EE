package cn.edu.zjut.dao;
import java.util.List;

import cn.edu.zjut.po.Customer;
import org.hibernate.Query;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import cn.edu.zjut.po.Address;

public class AddressDAO extends BaseHibernateDAO{
    private Log log = LogFactory.getLog(AddressDAO.class);

    //查询
    public List findByHql(String hql) {
        log.debug("finding Address instance by hql");
        try {
            String queryString = hql;
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by hql failed", re);
            throw re;
        }
    }

    //保存
    public void save(Address instance) {
        log.debug("saving Address instance");
        try {
            getSession().save(instance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    //更新
    public void update(Address instance){
        log.debug("updating Address instance");
        try {
            getSession().update(instance);
            log.debug("update successful");
        } catch (RuntimeException re) {
            log.error("update failed", re);
            throw re;
        }
    }

    //删除
    public void delete(Address instance){
        log.debug("deleting Address instance");
        try {
            getSession().delete(instance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
}