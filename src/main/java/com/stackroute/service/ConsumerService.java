package com.stackroute.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */
@Service
public class ConsumerService {

    /**
     * @RabbitListener to consume messages from queue produced by Producer
     */
    @RabbitListener(queues = "${jsa.rabbitmq.queue}")
    public void receivedMessage(String msg) {
        System.out.println("received msg=" + msg);
    }
}
