package com.ack.kafkaacknowledgement.service.mensagem;

import com.ack.kafkaacknowledgement.models.request.MensagemRequest;
import com.ack.kafkaacknowledgement.models.response.MensagemResponse;

public interface MensagemService {
    MensagemResponse postarMensagem(MensagemRequest mensagem);
}
