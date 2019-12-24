package com.lr.test.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kenny.cai
 * 定义队列
 */
@Configuration
public class MqQueueConfig {
    @Bean
    public Queue test() {
        return new Queue("test", true);
    }
}
