package com.ack.kafkaacknowledgement.models.request;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class MensagemRequest {
    @NonNull
    private String mensagem;
    @NonNull
    private String topico;
}
