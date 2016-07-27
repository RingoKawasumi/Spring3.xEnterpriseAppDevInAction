package com.baobaotao.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by zhujie on 16/7/27.
 */
@Service
public class LogonService {
    @Autowired(required = false)
    private LogDao logDao;

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public LogDao getLogDao() {
        return logDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

//    @Autowired
//    public void setLogDao(LogDao logDao) {
//        this.logDao = logDao;
//    }
//
//    @Autowired
//    @Qualifier("userDao")
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @Autowired
//    public void init(@Qualifier("userDao")UserDao userDao, LogDao logDao) {
//        System.out.println("multi param inject");
//        this.userDao = userDao;
//        this.logDao = logDao;
//    }
}
