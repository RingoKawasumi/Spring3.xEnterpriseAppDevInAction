package com.baobaotao.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 16/7/29.
 */
public class ApplicationEventTest {
    public static void main(String[] args) {
        String resourceFile = "com/baobaotao/event/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(resourceFile);
        MailSender mailSender = ctx.getBean(MailSender.class);
        mailSender.sendMail("test.mail");
        System.out.println("done.");
    }
}
