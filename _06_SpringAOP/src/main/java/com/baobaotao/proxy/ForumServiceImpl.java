package com.baobaotao.proxy;

/**
 * Created by zhujie on 16/8/1.
 */
public class ForumServiceImpl implements ForumService {
    public void removeTopic(int topicId) {
//        PerformanceMonitor.begin("com.baobaotao.proxy.ForumServiceImpl.removeTopic");
        System.out.println("模拟删除Topic记录:" + topicId);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
//        PerformanceMonitor.begin("com.baobaotao.proxy.ForumServiceImpl.removeForum");
        System.out.println("模拟删除Forum记录:" + forumId);
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        PerformanceMonitor.end();
    }
}
