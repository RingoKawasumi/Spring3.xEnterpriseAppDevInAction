package com.baobaotao.context;

import com.baobaotao.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/4/20.
 */
public class ApplicationContextLifeCycle {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/baobaotao/beanfactory/beans.xml");
        Car car = (Car) applicationContext.getBean("car");
        car.introduce();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
