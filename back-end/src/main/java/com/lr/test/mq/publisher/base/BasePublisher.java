package com.lr.test.mq.publisher.base;

public interface BasePublisher {
    void send(String exchange, String routingKey, Object msg);
}
