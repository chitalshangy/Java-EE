package cn.edu.zjut.dao;
import java.util.List;
import org.hibernate.Query;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import cn.edu.zjut.po.Customer;

public class CustomerDAO extends BaseHibernateDAO{
    private Log log = LogFactory.getLog(CustomerDAO.class);

    //登录查询
    public List findByHql(String hql) {
        log.debug("finding Customer instance by hql");
        try {
            String queryString = hql;
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by hql failed", re);
            throw re;
        }
    }

    //根据Customer id查找Customer
    public Customer findById(int Id){
        try {
            String queryString = "from Customer  where customerId=?0";
            Query queryObject=getSession().createQuery(queryString).setParameter(0,Id);
            return (Customer)queryObject.uniqueResult();
        } catch (RuntimeException re) {
            log.error("find by id failed", re);
            throw re;
        }
    }

    //注册保存
    public void save(Customer instance) {
        log.debug("saving Customer instance");
        try {
            getSession().save(instance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    //更新
    public void update(Customer instance){
        log.debug("updating Customer instance");
        try {
            getSession().update(instance);
            log.debug("update successful");
        } catch (RuntimeException re) {
            log.error("update failed", re);
            throw re;
        }
    }

    //删除
    public void delete(Customer instance){
        log.debug("deleting Customer instance");
        try {
            getSession().delete(instance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
}