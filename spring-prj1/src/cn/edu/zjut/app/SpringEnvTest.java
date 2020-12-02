package cn.edu.zjut.app;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEnvTest {
    public static void main(String []args){
        /*
        //创建Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取CustomerDAO实例
        //ICustomerDAO userDAO = (ICustomerDAO) ctx.getBean("userDAO");
        //userDAO.save();

        //获取UserService实例
        IUserService userService = (IUserService) ctx.getBean("userService");
        userService.register();
        */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        IUserService userService = (IUserService)ctx.getBean("userService");
        Customer cust = new Customer();
        //cust.setCustomerId(1);
        cust.setAccount("SPRING");
        cust.setPassword("SPRING");
        userService.register(cust);
    }

}
