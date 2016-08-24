package com.baobaotao;

import com.baobaotao.anno.NeedTest;

/**
 * Created by zhujie on 16/8/16.
 */
public class NaughtyWaiter implements Waiter {
    @NeedTest
    public void greetTo(String clientName) {
        System.out.println("NaughtyWaiter:greet to "+clientName+"...");
    }

    public void serveTo(String clientName) {
        System.out.println("NaughtyWaiter:serving "+clientName+"...");
    }
}
