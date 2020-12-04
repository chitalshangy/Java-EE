package cn.edu.zjut.app;

import cn.edu.zjut.bean.IItem;
import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.ItemOrder;
import cn.edu.zjut.bean.ShoppingCart;
import cn.edu.zjut.event.EmailEvent;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SpringEnvTes {
    public static void main(String []args){
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*构造器注入
        //获取第一个bean
        IItem item1 = (IItem)ctx.getBean("item1");
        System.out.println(item1.getItemID());
        System.out.println(item1.getTitle());
        System.out.println(item1.getDescription());
        System.out.println(item1.getCost());
        //获取第二个bean
        IItem item2 = (IItem) ctx.getBean("item2");
        System.out.println(item2.getItemID());
        System.out.println(item2.getTitle());
        System.out.println(item2.getDescription());
        System.out.println(item2.getCost());
        */

        /*使用设置注入
        IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemorder1");
        System.out.println("书名：" + itemorder1.getItem().getTitle());
        System.out.println("数量：" + itemorder1.getNumItems());
        IItemOrder itemorder2 = (IItemOrder) ctx.getBean("itemorder2");
        System.out.println("书名：" + itemorder2.getItem().getTitle());
        System.out.println("数量：" + itemorder2.getNumItems());
        */

        /*
        //list配置、Set配置、Map配置、Properties配置
        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");
        for(Object i:shoppingCart.getItemsOrdered()){
            System.out.println(i.toString());
        }
        */

        /*实验二第一部分
        System.out.println("getBean(item1)---1");
        IItem item11 = (IItem) ctx.getBean("item1");
        System.out.println("getBean(item1)---2");
        IItem item12 = (IItem) ctx.getBean("item1");
        System.out.println("getBean(item2)---1");
        IItem item21 = (IItem) ctx.getBean("item2");
        System.out.println("getBean(item2)---2");
        IItem item22 = (IItem) ctx.getBean("item2");
        */
        /*实验二第二部分
        IItemOrder itemorder1 = (IItemOrder)ctx.getBean("itemorder1");
        //需要转换类型并且关闭容器才会调用destroy()
        ((ClassPathXmlApplicationContext)ctx).close();
        */
        /*实验二第三部分
        IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemorder2");
        */

        /*实验三第一部分
        1、
        FileSystemResource isr = new FileSystemResource("src/applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(isr);
        IItemOrder itemorder3 = (IItemOrder)factory.getBean("itemorder2");

        2、
        ClassPathResource res = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        IItemOrder itemorder3 = (IItemOrder)factory.getBean("itemorder2");

        3、
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IItemOrder itemorder3 = (IItemOrder) ctx.getBean("itemorder2");
        4、
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        IItemOrder itemorder3 = (IItemOrder) ctx.getBean("itemorder2");
        */
        /*实验三第二部分
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object[] objects = new Object[]{"HelloWorld",new Date()};
        //String message= ctx.getMessage("HelloWorld",objects, Locale.CHINA);
        String message=ctx.getMessage("HelloWorld",objects,Locale.US);
        System.out.println(message);
        */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmailEvent ele = new EmailEvent("hello", "spring_test@zjut.edu.cn", "this is a test");
        ctx.publishEvent(ele);
    }
}