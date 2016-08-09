package com.baobaotao.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/8/2.
 */
public class TestBeforeAdvice {
    public static void main(String[] args) throws Exception {
//        Waiter target = new NaiveWaiter();
//        BeforeAdvice advice = new GreetingBeforeAdvice();
//        ProxyFactory pf = new ProxyFactory();
//        pf.setInterfaces(target.getClass().getInterfaces());
//        pf.setOptimize(true);
//        pf.setTarget(target);
//        pf.addAdvice(advice);
//        Waiter proxy = (Waiter) pf.getProxy();
//        proxy.greetTo("John");
//        proxy.serveTo("Tom");

        String configPaht = "com/baobaotao/advice/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPaht);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");

        ForumService forumService = (ForumService) ctx.getBean("forumService");
//        forumService.removeForum(1024);
        forumService.updateForum(null);
    }
}
