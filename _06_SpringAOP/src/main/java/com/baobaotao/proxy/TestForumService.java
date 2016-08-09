package com.baobaotao.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zhujie on 16/8/1.
 */
public class TestForumService {
    public static void main(String[] args) {
//        ForumService forumService = new ForumServiceImpl();
//        forumService.removeForum(10);
//        forumService.removeTopic(1012);

        // JDK动态代理
//        ForumService target = new ForumServiceImpl();
//        PerformanceHandler handler = new PerformanceHandler(target);
//        ForumService proxy = (ForumService) Proxy.newProxyInstance(
//                target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
//        proxy.removeForum(10);
//        proxy.removeTopic(1012);

        // CGLIB动态代理
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1012);
    }
}
