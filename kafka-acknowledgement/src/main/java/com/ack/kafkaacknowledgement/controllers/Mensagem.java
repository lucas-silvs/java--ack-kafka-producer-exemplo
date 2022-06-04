package com.ack.kafkaacknowledgement.controllers;

import com.ack.kafkaacknowledgement.models.request.MensagemRequest;
import com.ack.kafkaacknowledgement.models.response.MensagemResponse;
import org.springframework.http.ResponseEntity;

public interface Mensagem {

    ResponseEntity<MensagemResponse> postaMensagemNoTopico(MensagemRequest mensagem);
}
