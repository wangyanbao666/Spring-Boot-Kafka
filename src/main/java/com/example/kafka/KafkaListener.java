package com.example.kafka;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(topics = "wyb-topic", groupId = "1")
    void listener(String data){
        System.out.println("data received: "+data);
    }

}
