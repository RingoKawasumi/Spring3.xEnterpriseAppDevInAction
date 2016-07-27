package com.baobaotao.tagdepend;

import java.util.TimerTask;

/**
 * Created by zhujie on 16/7/26.
 */
public class CacheTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("doing clean cache");
    }
}
