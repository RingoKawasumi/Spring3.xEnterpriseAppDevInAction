package com.baobaotao.anno;

import java.lang.reflect.Method;

/**
 * Created by zhujie on 16/8/9.
 */
public class TestTool {
    public static void main(String[] args) {
        Class clazz = ForumService.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if (nt != null) {
                System.out.println(method.getName() + "()需要测试");
            } else {
                System.out.println(method.getName() + "()不需要测试");
            }
        }
    }
}
