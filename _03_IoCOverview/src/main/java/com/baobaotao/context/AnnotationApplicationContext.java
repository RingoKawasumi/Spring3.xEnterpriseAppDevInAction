package com.baobaotao.context;

import com.baobaotao.reflect.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kawasumi on 15/12/6.
 */
public class AnnotationApplicationContext {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Car car = ctx.getBean("car", Car.class);
    }
}
