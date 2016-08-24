package com.baobaotao.aspectj.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by zhujie on 16/8/9.
 */
@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("How are you");
    }
}
