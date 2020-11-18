package com.mybatis.test;

import com.mybatis.po.MyUser;
import com.pojo.MapUser;
import com.pojo.SelectUserParam;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest{
    public static void main(String[] args){
        try {
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            SqlSession ss=ssf.openSession();
/*
            //查询一个用户
            System.out.println("查询一个用户");
            MyUser mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 1);
            System.out.println(mu);
            //添加一个用户
            System.out.println("添加一个用户");
            MyUser addmu=new MyUser();
            addmu.setUid(100);
            addmu.setUname("张三");
            addmu.setUsex("男");
            ss.insert("com.mybatis.mapper.UserMapper.addUser",addmu);
            //修改一个用户
            System.out.println("修改一个用户");
            MyUser updatemu=new MyUser(100,"李四","女");
            ss.update("com.mybatis.mapper.UserMapper.updateUser",updatemu);
            //删除一个用户
            System.out.println("删除一个用户");
            ss.delete("com.mybatis.mapper.UserMapper.deleteUser",100);
 */
            //查询所有用户
            System.out.println("查询所有用户");
            /*实验一代码
            List<MyUser> allmu=new ArrayList<MyUser>();
            allmu = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
            for(MyUser m:allmu){
                System.out.println(m);
            }
            */
            /*实验二修改前
            Map<String,Object> map=new HashMap<>();
            map.put("u_name","陈");
            map.put("u_sex","男");
            List<MyUser> list=ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser",map);
             */
            /*实验二第一次修改
            SelectUserParam su = new SelectUserParam();
            su.setU_name("陈");
            su.setU_sex("男");
            List<MyUser> list=ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser",su);
             */
            /*实验二第二次修改
            List<Map<String,Object>>list=ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
             */
            //实验二第三次修改代码
            List<MapUser>list=ss.selectList("com.mybatis.mapper.UserMapper.selectResultMap");
            for(Object myUser:list){
                System.out.println(myUser);
            }

            ss.commit();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
