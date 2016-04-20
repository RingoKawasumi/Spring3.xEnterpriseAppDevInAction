package com.baobaotao.beanfactory;

import com.baobaotao.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by zhujie on 16/4/20.
 */
public class BeanLifeCycle {

    public static void main(String[] args) {
        lifeCycleInBeanFactory();
    }

    private static void lifeCycleInBeanFactory() {
        //①下面两句装载配置文件并启动容器
        Resource res = new ClassPathResource("com/baobaotao/beanfactory/beans.xml");
        BeanFactory bf = new XmlBeanFactory(res);

        //②向容器中注册MyBeanPostProcessor后处理器
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyBeanPostProcessor());

        //③向容器中注册MyInstantiationAwareBeanPostProcessor后处理器
        ((ConfigurableBeanFactory) bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        //④第一次从容器中获取car，将触发容器实例化该Bean，这将引发Bean生命周期方法的调用。
        Car car1 = (Car) bf.getBean("car");
        car1.introduce();
        car1.setColor("红色");

        //⑤第二次从容器中获取car，直接从缓存池中获取
        Car car2 = (Car) bf.getBean("car");

        //⑥查看car1和car2是否指向同一引用
        System.out.println("car1==car2:" + (car1 == car2));

        //⑦关闭容器
        ((XmlBeanFactory) bf).destroySingletons();
    }
}
