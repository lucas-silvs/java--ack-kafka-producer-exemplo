package com.ack.kafkaacknowledgement.gateway.kafka;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.errors.TimeoutException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class KafkaPost {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaPost(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message, String topicName) {
        try {
            kafkaTemplate.send(topicName, message).get(3, TimeUnit.SECONDS);
            log.info("Mensagem postada no topico:  " + topicName);
        } catch (ExecutionException e) {
            log.warn("Erro ao enviar mensagem para o tópico, execução");
        } catch (InterruptedException e) {
            log.warn("Erro ao enviar mensagem para o tópico, interrompido");
            Thread.currentThread().interrupt();
        } catch (java.util.concurrent.TimeoutException e) {
            log.warn("Erro ao enviar mensagem para o tópico, timeout");

        }
    }
}

