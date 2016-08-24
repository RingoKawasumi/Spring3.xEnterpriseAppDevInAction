package com.baobaotao.anno;

/**
 * Created by zhujie on 16/8/9.
 */
public class ForumService {
    @NeedTest
    public void deleteForum(int forumId) {
        System.out.println("删除论坛模块：" + forumId);
    }

    @NeedTest
    public void deleteTopic(int topicId) {
        System.out.println("删除论坛主题：" + topicId);
    }
}
