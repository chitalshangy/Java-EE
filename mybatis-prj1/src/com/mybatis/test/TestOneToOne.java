package com.mybatis.test;

import com.dao.PersonDao;
import com.mybatis.po.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestOneToOne {
    private static PersonDao personDao;
    public static void test(){
        InputStream config = null;
        try {
            config = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
        SqlSession ss=ssf.openSession();

        personDao=ss.getMapper(PersonDao.class);

        Person p1=personDao.selectPersonById1(1);
        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getAge()+" "+p1.getCard().getId()+" "+p1.getCard().getCode());
        System.out.println("======================");

        Person p2=personDao.selectPersonById1(2);
        System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getAge()+" "+p2.getCard().getId()+" "+p2.getCard().getCode());
        System.out.println("======================");

        Person p3=personDao.selectPersonById1(3);
        System.out.println(p3.getId()+" "+p3.getName()+" "+p3.getAge()+" "+p3.getCard().getId()+" "+p3.getCard().getCode());

        ss.commit();
        ss.close();
    }
    public static void main(String []args){
        test();
    }
}
