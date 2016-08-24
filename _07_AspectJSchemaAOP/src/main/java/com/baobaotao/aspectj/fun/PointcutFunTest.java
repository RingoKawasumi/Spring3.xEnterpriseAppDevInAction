package com.baobaotao.aspectj.fun;

import com.baobaotao.Seller;
import com.baobaotao.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/8/16.
 */
public class PointcutFunTest {
    public static void main(String[] args) {
        String configPath = "com/baobaotao/aspectj/fun/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

//        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
//        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
//        naiveWaiter.greetTo("John");
//        naughtyWaiter.greetTo("Tom");

        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        naiveWaiter.greetTo("John");
        naiveWaiter.serveTo("John");
        ((Seller)naiveWaiter).sell("Beer", "John");
    }
}
