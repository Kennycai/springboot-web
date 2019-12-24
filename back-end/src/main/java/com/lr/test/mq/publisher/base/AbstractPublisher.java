package com.lr.test.mq.publisher.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kenny.cai
 */
@Slf4j
public abstract class AbstractPublisher implements BasePublisher {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public void send(String exchange, String routingKey, Object msg) {
        rabbitTemplate.convertAndSend(exchange, routingKey, msg);
    }
}
