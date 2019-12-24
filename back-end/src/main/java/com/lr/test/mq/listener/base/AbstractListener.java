package com.lr.test.mq.listener.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;

/**
 * @author kenny.cai
 */
@Slf4j
public class AbstractListener implements BaseListener {
    @Override
    @RabbitHandler
    public void process(String msg) {
        log.info("接收到消息:{}", msg);
        handler(msg);
    }

    @Override
    public void handler(String msg) {

    }
}
