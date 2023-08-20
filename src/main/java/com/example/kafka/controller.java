package com.example.kafka;

import com.example.kafka.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private Service service;

    @GetMapping("send/{message}")
    public void sendMessage(@PathVariable("message") String message){
        service.sendMessage(message);
    }
}
