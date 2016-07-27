package com.baobaotao.injectfun;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by zhujie on 16/7/26.
 */
public class Boss2 implements MethodReplacer {
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        Car car = new Car();
        car.setBrand("美人豹");
        return car;
    }
}
