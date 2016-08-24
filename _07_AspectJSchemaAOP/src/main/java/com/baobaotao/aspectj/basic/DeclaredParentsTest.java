package com.baobaotao.aspectj.basic;

import com.baobaotao.Seller;
import com.baobaotao.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/8/16.
 */
public class DeclaredParentsTest {
    public static void main(String[] args) {
        String configPaht = "com/baobaotao/aspectj/basic/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPaht);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        Seller seller = (Seller) waiter;
        seller.sell("Beer", "John");
    }
}
