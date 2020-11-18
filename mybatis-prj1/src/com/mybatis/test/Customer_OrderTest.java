package com.mybatis.test;

import com.dao.CustomerDao;
import com.dao.PersonDao;
import com.mybatis.po.Customer;
import com.mybatis.po.Order;
import com.mybatis.po.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Customer_OrderTest {
    private static CustomerDao customerDao;
    public static void test(){
        InputStream config = null;
        try {
            config = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
        SqlSession ss=ssf.openSession();

        customerDao=ss.getMapper(CustomerDao.class);

        List<Customer> list=customerDao.selectAll();
        for(Customer mid:list){
            System.out.print(mid.getId()+" "+mid.getName()+" "+mid.getPhone()+" ");
            for(Order mid1:mid.getOrderList()){
                System.out.print(mid1.getContent()+" ");
            }
            System.out.println();
        }

        ss.commit();
        ss.close();
    }
    public static void main(String []args){
        test();
    }
}
