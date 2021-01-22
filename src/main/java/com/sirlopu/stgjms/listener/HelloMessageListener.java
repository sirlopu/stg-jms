package com.sirlopu.stgjms.listener;

import com.sirlopu.stgjms.config.JmsConfig;
import com.sirlopu.stgjms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloMessageListener {
    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers,
                       Message message){
        System.out.println("I got a Message!!!");

        System.out.println(helloWorldMessage);
    }
}
