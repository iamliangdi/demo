package com.liangdi.demo.kafka.producer.controller;

import com.liangdi.demo.common.entity.http.Response;
import com.liangdi.demo.kafka.producer.service.KafkaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Di
 * @since 1.0.0
 */
@RestController
public class KafkaController {

    private final KafkaService kafkaService;

    public KafkaController(KafkaService kafkaService){
        this.kafkaService = kafkaService;
    }

    @PostMapping(value = "/api/v1/demo/kafka/send")
    public Response<Void> sendMessage(@RequestParam String message){
        kafkaService.sendMessage(message);
        return new Response<>(HttpStatus.OK.value(), "消息发送成功");
    }

}
