package com.lr.test.mq.listener;

import com.lr.test.mq.listener.base.AbstractListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author kenny.cai
 */
@Slf4j
@Component
@RabbitListener(bindings = {
        @QueueBinding(value = @Queue(value = "test", durable = "true"),
                exchange = @Exchange(value = "exchange", type = ExchangeTypes.TOPIC), key = "routingKey")})
public class TestListener extends AbstractListener {
    @Override
    public void handler(String msg) {
        log.info("处理消息:{}", msg);
    }
}
