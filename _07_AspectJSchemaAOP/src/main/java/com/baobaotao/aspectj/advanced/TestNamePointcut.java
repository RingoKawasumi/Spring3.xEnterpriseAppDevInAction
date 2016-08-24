package com.baobaotao.aspectj.advanced;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zhujie on 16/8/17.
 */
public class TestNamePointcut {
    @Pointcut("within(com.baobaotao.*)")
    private void inPackage(){}

    @Pointcut("execution(* greetTo(..))")
    protected void greetTo(){}

    @Pointcut("inPackage() and greetTo()")
    public void inPkgGreetTo(){}
}
