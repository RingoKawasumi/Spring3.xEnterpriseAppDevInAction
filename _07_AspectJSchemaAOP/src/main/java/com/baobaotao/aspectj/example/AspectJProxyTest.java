package com.baobaotao.aspectj.example;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.Waiter;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/8/9.
 */
public class AspectJProxyTest {
    public static void main(String[] args) {
//        Waiter waiter = new NaiveWaiter();
//        AspectJProxyFactory factory = new AspectJProxyFactory();
//        factory.setTarget(waiter);
//        factory.addAspect(PreGreetingAspect.class);
//        Waiter proxy = factory.getProxy();
//        proxy.greetTo("John");
//        proxy.serveTo("John");

        String configPaht = "com/baobaotao/aspectj/example/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPaht);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
