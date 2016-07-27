package com.baobaotao.attr;

import java.util.*;

/**
 * Created by zhujie on 16/7/26.
 */
public class Boss {
    private String name;
    private int age;
    private Car car;

    private List<String> favorites = new ArrayList();
    private Set<String> favorites2 = new HashSet();
    private Map<String, String> jobs = new HashMap<String, String>();
    private Properties mails = new Properties();
    private Map<String, Integer> jobTime =  new HashMap<String, Integer>();

    public Map<String, Integer> getJobTime() {
        return jobTime;
    }

    public void setJobTime(Map<String, Integer> jobTime) {
        this.jobTime = jobTime;
    }

    public Properties getMails() {
        return mails;
    }

    public void setMails(Properties mails) {
        this.mails = mails;
    }

    public Map<String, String> getJobs() {
        return jobs;
    }

    public void setJobs(Map<String, String> jobs) {
        this.jobs = jobs;
    }

    public Set<String> getFavorites2() {
        return favorites2;
    }

    public void setFavorites2(Set<String> favorites2) {
        this.favorites2 = favorites2;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
