package com.baobaotao.aspectj.fun;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by zhujie on 16/8/16.
 */
@Aspect
public class TestAspect {
//    @AfterReturning("@annotation(com.baobaotao.anno.NeedTest)")
//    public void needTestFun() {
//        System.out.println("needTestFun() executed!");
//    }

    @AfterReturning("this(com.baobaotao.Seller)")
    public void thisTest() {
        System.out.println("thisTest() executed!");
    }
}
