package com.baobaotao.tagdepend;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zhujie on 16/7/26.
 */
public class CacheManager {
    public CacheManager() {
        Timer timer = new Timer();
        TimerTask cacheTask = new CacheTask();
        timer.schedule(cacheTask, 0, SystemSettings.REFPRESH_CYCLE);
    }
}
