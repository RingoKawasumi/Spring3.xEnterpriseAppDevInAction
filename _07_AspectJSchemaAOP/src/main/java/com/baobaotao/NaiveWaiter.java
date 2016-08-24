package com.baobaotao;

/**
 * Created by zhujie on 16/8/9.
 */
@Monitorable
public class NaiveWaiter implements Waiter {
    public void greetTo(String clientName) {
        System.out.println("NaiveWaiter:greet to "+clientName+"...");
    }

    public void serveTo(String clientName) {
        System.out.println("NaiveWaiter:serving "+clientName+"...");
    }

    public void smile(String clientName, int times) {
        System.out.println("NaiveWaiter:smile to  "+clientName+ times+"times...");
    }
}
