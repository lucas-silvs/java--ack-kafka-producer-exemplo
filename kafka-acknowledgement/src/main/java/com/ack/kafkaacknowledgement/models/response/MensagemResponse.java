package com.ack.kafkaacknowledgement.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MensagemResponse {

    private String mensagemStatusPostado;
}
