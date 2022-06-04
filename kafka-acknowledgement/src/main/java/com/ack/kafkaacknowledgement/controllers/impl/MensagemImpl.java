package com.ack.kafkaacknowledgement.controllers.impl;

import com.ack.kafkaacknowledgement.controllers.Mensagem;
import com.ack.kafkaacknowledgement.models.request.MensagemRequest;
import com.ack.kafkaacknowledgement.models.response.MensagemResponse;
import com.ack.kafkaacknowledgement.service.mensagem.MensagemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/kafka")
public class MensagemImpl implements Mensagem {

    private MensagemService mensagemService;

    @PostMapping("/postar-mensagem")
    public ResponseEntity<MensagemResponse> postaMensagemNoTopico(@RequestBody MensagemRequest mensagem) {
       MensagemResponse response = mensagemService.postarMensagem(mensagem);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
