package cn.edu.zjut.service;

import cn.edu.zjut.dao.AddressDAO;
import cn.edu.zjut.dao.CustomerDAO;
import cn.edu.zjut.po.Address;
import cn.edu.zjut.po.Customer;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Map;

public class UserService {
    private Map<String, Object> request, session;
    //登录
    public boolean login(Customer loginUser) {
        ActionContext ctx= ActionContext.getContext();
        session=(Map) ctx.getSession();
        request=(Map) ctx.get("request");
        String account = loginUser.getAccount();
        String password = loginUser.getPassword();
        String hql = "from Customer as user where account='" + account + "' and password='" + password + "'";
        CustomerDAO dao = new CustomerDAO();
        List list = dao.findByHql(hql);
        dao.getSession().close();
        if (list.isEmpty())
            return false;
        else{
            session.put("user", account);
            request.put("tip", "登录成功！");
            loginUser=(Customer)list.get(0);
            request.put("loginUser", loginUser);
            return true;
        }
    }

    //添加地址
    public boolean addAddr(Customer loginUser, Address address) {
        ActionContext ctx= ActionContext.getContext();
        request=(Map) ctx.get("request");
        //CustomerDAO c_dao = new CustomerDAO();
        //loginUser = (Customer)c_dao.findById(loginUser.getCustomerId());
        //address.setCustomer(loginUser);//注释1
        //loginUser.getAddresses().add(address);
        CustomerDAO c_dao = new CustomerDAO();
        loginUser = (Customer)c_dao.findById(loginUser.getCustomerId());
        address.setCust_id(loginUser);
        Transaction tran = null;
        AddressDAO a_dao=new AddressDAO();
        try {
            /*
            tran = c_dao.getSession().beginTransaction();
            c_dao.update(loginUser);
            tran.commit();
            request.put("loginUser", loginUser);
            request.put("tip", "添加地址成功！");
            */
            tran = a_dao.getSession().beginTransaction();
            a_dao.save(address);
            loginUser.setAddressid(a_dao.findById(loginUser));
            c_dao.update(loginUser);
            tran.commit();
            return true;
        } catch (Exception e) {
            if(tran != null) tran.rollback();
            return false;
        } finally {
            //c_dao.getSession().close();
            a_dao.getSession().close();
        }
    }

    //删除联系
    //删除地址
    public boolean delAddr(Customer loginUser, Address address){
        /*
        ActionContext ctx= ActionContext.getContext();
        request=(Map) ctx.get("request");
        CustomerDAO c_dao = new CustomerDAO();
        loginUser = (Customer)c_dao.findById(loginUser.getCustomerId());
        */
        CustomerDAO c_dao = new CustomerDAO();
        AddressDAO a_dao=new AddressDAO();
        loginUser = (Customer)c_dao.findById(loginUser.getCustomerId());
        address = (Address)a_dao.findById(loginUser);
        Transaction tran = null;
        try {
            /*
            tran=c_dao.getSession().beginTransaction();
            Address a=c_dao.getSession().get(Address.class,address.getAddressId());
            loginUser.getAddresses().remove(a);
            tran.commit();
            */
            tran=a_dao.getSession().beginTransaction();
            a_dao.delete(address);
            tran.commit();
            return true;
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            return false;
        }
        finally {
            //c_dao.getSession().close();
            a_dao.getSession().close();
        }
    }
}
