package com.baobaotao.tagdepend;

/**
 * Created by zhujie on 16/7/26.
 */
public class SysInit {
    public SysInit() {
        System.out.println("SysInit");
        SystemSettings.REFPRESH_CYCLE = 100;
        SystemSettings.SESSION_TIMEOUT = 10;
    }
}
