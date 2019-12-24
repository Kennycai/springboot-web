package com.lr.test.mq;

import com.lr.test.mq.publisher.TestPublisher;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@WebAppConfiguration
@Slf4j
@Rollback
@Transactional
public class TestPublisherTest {
    @Autowired
    TestPublisher testPublisher;
    @Test
    public void send() {
        testPublisher.send("exchange", "routingKey","test");
    }
}
