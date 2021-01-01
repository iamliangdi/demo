package com.liangdi.demo.kafka.consumer.service.impl;

import com.liangdi.demo.kafka.consumer.service.KafkaService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Liang Di
 * @since 1.0.0
 */
@Service
public class KafkaServiceImpl implements KafkaService {

    @Override
    @KafkaListener(topics = "kafka_demo")
    public void listenProducer(String message) {
        System.out.println("kafka_demo：" + message);
    }

}
