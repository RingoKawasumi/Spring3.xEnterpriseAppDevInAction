package com.baobaotao.editor;

/**
 * Created by zhujie on 16/7/27.
 */
public class Boss {
    private String name;
    private Car car = new Car();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
