package com.ack.kafkaacknowledgement.service.mensagem.impl;

import com.ack.kafkaacknowledgement.gateway.kafka.KafkaPost;
import com.ack.kafkaacknowledgement.models.request.MensagemRequest;
import com.ack.kafkaacknowledgement.models.response.MensagemResponse;
import com.ack.kafkaacknowledgement.service.mensagem.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensagemServiceImpl implements MensagemService {

    @Autowired
    private KafkaPost kafkaPost;

    public MensagemResponse postarMensagem(MensagemRequest mensagem) {
        postarTopicoTeste(mensagem.getMensagem(), mensagem.getTopico());

        return null;
    }


    private void postarTopicoTeste(String mensagem, String topico){
        kafkaPost.sendMessage(mensagem, topico);
    }
}
