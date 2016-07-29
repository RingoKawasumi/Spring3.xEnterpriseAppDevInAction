package com.baobaotao.beanprop;

import javax.sql.DataSource;

/**
 * Created by zhujie on 16/7/28.
 */
public class SysConfig {
    private int sessionTimeout;
    private int maxTabpageNum;
    private DataSource dataSource;

    public void initFromDB() {
        this.sessionTimeout = 30;
        this.maxTabpageNum = 10;
    }

    public int getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(int sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public int getMaxTabpageNum() {
        return maxTabpageNum;
    }

    public void setMaxTabpageNum(int maxTabpageNum) {
        this.maxTabpageNum = maxTabpageNum;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
