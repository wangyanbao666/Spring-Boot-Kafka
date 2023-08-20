package com.example.kafka.services;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg){
        System.out.println(msg);
        kafkaTemplate.send("wyb-topic", msg);
    }

}
