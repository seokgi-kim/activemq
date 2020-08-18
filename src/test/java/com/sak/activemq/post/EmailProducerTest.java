package com.sak.activemq.post;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by seokgi4885@gmail.com on 2020-08-18.
 */
@SpringBootTest
class EmailProducerTest {

    @Autowired
    private EmailProducer emailProducer;

    @Test
    public void testSendMsg() {
        emailProducer.sendMsg("seokgi4885@gmail.com", "Hello!!");
    }
}