package com.github.outerman.eventcenter.itf;

import java.io.Serializable;

/**
 * Created by shenxy on 26/9/17.
 *
 * 事件生产者的接口
 */
public interface IEventProducer {
    void postEvent(String eventType, Serializable eventBean) throws Exception;

    void postEventSync(String eventType, Serializable eventBean) throws Exception;
}
