package com.ack.kafkaacknowledgement.controllers.impl;

import com.ack.kafkaacknowledgement.controllers.Mensagem;
import com.ack.kafkaacknowledgement.models.request.MensagemRequest;
import com.ack.kafkaacknowledgement.models.response.MensagemResponse;
import com.ack.kafkaacknowledgement.service.mensagem.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/kafka")
public class MensagemImpl implements Mensagem {

    @Autowired
    private MensagemService mensagemService;

    @PostMapping("/postar-mensagem")
    public ResponseEntity<MensagemResponse> postaMensagemNoTopico(@RequestBody MensagemRequest mensagem) {
        try {
            MensagemResponse response = mensagemService.postarMensagem(mensagem);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(MensagemResponse.builder().
                    mensagemStatusPostado("Ocorreu algum erro ao publicar mensagem: error - "+e.getMessage())
                    .build(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
