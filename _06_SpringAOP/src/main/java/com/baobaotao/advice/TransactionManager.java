package com.baobaotao.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by zhujie on 16/8/2.
 */
public class TransactionManager implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target,
                              Exception ex) throws Throwable {
        System.out.println("-----------");
        System.out.println("method:" + method.getName());
        System.out.println("抛出异常:" + ex.getMessage());
        System.out.println("成功回滚事务。");
    }
}
