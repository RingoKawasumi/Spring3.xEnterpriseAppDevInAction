package com.baobaotao.i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by zhujie on 16/7/28.
 */
public class I18nGreeting {
    private static void rsrBdlMessageResource() {
        String[] configs = {"com/baobaotao/i18n/beans.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);

        MessageSource ms = (MessageSource) ctx.getBean("myResource1");
        Object[] params = {"John", new GregorianCalendar().getTime()};

        String str1 = ms.getMessage("greeting.common", params, Locale.US);
        String str2 = ms.getMessage("greeting.morning", params, Locale.CHINA);
        String str3 = ms.getMessage("greeting.afternoon", params, Locale.CHINA);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    private static void rrsrBdlMessageResource() throws InterruptedException {
        String[] configs = {"com/baobaotao/i18n/beans.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);

        MessageSource ms = (MessageSource) ctx.getBean("myResource2");
        Object[] params = {"John", new GregorianCalendar().getTime()};

        for (int i = 0; i < 2; i++) {
            String str1 = ms.getMessage("greeting.common", params, Locale.US);
            System.out.println(str1);
            Thread.sleep(20000);
        }
    }

    private static void ctxMessageResource() {
        String[] configs = {"com/baobaotao/i18n/beans.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        Object[] params = {"John", new GregorianCalendar().getTime()};

        String str1 = ctx.getMessage("greeting.common", params, Locale.US);
        String str2 = ctx.getMessage("greeting.morning", params, Locale.CHINA);
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args) throws InterruptedException {
//        rsrBdlMessageResource();
//        rrsrBdlMessageResource();
        ctxMessageResource();
    }
}
