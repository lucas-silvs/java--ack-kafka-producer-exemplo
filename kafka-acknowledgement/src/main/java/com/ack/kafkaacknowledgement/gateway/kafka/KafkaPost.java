package com.ack.kafkaacknowledgement.gateway.kafka;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaPost {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaPost(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message, String topicName) {
        kafkaTemplate.send(topicName, message);
        log.info("Mensagem postada no topico:  "+topicName);
    }
}

