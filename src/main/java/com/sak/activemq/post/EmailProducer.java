package com.sak.activemq.post;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by seokgi4885@gmail.com on 2020-08-18.
 */
@Service
public class EmailProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMsg(String email, String msg) {
        jmsTemplate.convertAndSend("mailbox", new Email(email, msg));
        System.out.println("email = " + email);
        System.out.println("msg = " + msg);
        System.out.println("Sending an email message!!");
    }

}
