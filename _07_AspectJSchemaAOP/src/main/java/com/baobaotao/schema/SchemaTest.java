package com.baobaotao.schema;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;
import com.baobaotao.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/8/17.
 */
public class SchemaTest {
    public static void main(String[] args) {
        String configPath = "com/baobaotao/schema/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        SmartSeller seller = (SmartSeller) ctx.getBean("seller");
        naiveWaiter.greetTo("John");
        naiveWaiter.serveTo("John");
        naughtyWaiter.greetTo("Tom");
        seller.sell("Beer", "John");
//        ((Seller)naiveWaiter).sell("Beer", "Tom");
//        seller.checkBill(1);
        ((NaiveWaiter)naiveWaiter).smile("John", 2);
    }
}
