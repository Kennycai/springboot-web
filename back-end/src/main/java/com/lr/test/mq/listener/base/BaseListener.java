package com.lr.test.mq.listener.base;

/**
 * @author kenny.cai
 */
public interface BaseListener {
    void process(String msg);
    void handler(String msg);
}
