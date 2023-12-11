package com.wu.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

@Controller
public class RabbitMqController {
    @RabbitListener(queues = "test")
    public void testsRabbitMq(String message) {
        System.out.println(message);
    }

}
