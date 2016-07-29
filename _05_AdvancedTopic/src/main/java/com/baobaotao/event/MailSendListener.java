package com.baobaotao.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by zhujie on 16/7/29.
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {

    public void onApplicationEvent(MailSendEvent event) {
        System.out.println("MailSendListener:向" + event.getTo() + "发送完一封邮件");
    }
}
