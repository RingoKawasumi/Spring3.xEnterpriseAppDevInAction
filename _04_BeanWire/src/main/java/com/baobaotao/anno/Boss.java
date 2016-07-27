package com.baobaotao.anno;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by zhujie on 16/7/27.
 */
@Component
public class Boss {
    private Car car;

    public Boss(){
        System.out.println("construct...");
    }

    @Resource
    public void setCar(Car car) {
        System.out.println("execute in setCar");
        this.car = car;
    }

    @PostConstruct
    private void init1() {
        System.out.println("execute in init1");
    }

    @PostConstruct
    private void init2() {
        System.out.println("execute in init2");
    }

    @PreDestroy
    private void destroy1() {
        System.out.println("execute in destory1");
    }

    @PreDestroy
    private void destroy2() {
        System.out.println("execute in destory2");
    }
}
