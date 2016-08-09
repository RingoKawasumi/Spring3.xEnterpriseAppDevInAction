package com.baobaotao.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/8/3.
 */
public class TestAdvisor {
    public static void main(String[] args) {
        String configPaht = "com/baobaotao/advisor/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPaht);

        //普通方法名匹配切面
//        Waiter waiter = (Waiter) ctx.getBean("waiter");
//        Seller seller = (Seller) ctx.getBean("seller");
//        waiter.greetTo("John");
//        waiter.serveTo("John");
//        seller.greetTo("John");

        //正则表达式方法名匹配切面
//        Waiter waiter = (Waiter) ctx.getBean("waiter1");
//        waiter.greetTo("John");
//        waiter.serveTo("John");

        //动态切面
//        Waiter waiter = (Waiter) ctx.getBean("waiter2");
//        waiter.serveTo("Peter");
//        waiter.greetTo("Peter");
//        waiter.serveTo("John");
//        waiter.greetTo("John");

        //控制流程切面
//        Waiter waiter = (Waiter) ctx.getBean("waiter3");
//        WaiterDelegate wd = new WaiterDelegate();
//        wd.setWaiter(waiter);
//        waiter.serveTo("Peter");
//        waiter.greetTo("Peter");
//        wd.service("Peter");

        //复合切点切面
        Waiter waiter = (Waiter) ctx.getBean("waiter4");
        WaiterDelegate wd = new WaiterDelegate();
        wd.setWaiter(waiter);
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
        wd.service("Peter");
    }
}
