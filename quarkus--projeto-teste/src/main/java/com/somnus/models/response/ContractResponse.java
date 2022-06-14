package com.somnus.models.response;

public class ContractResponse {

    private String origin;
    private String situacaoRequest;
    private String mensagemParaUsuario;

    public ContractResponse(String origin, String situacaoRequest, String mensagemParaUsuario) {
        this.origin = origin;
        this.situacaoRequest = situacaoRequest;
        this.mensagemParaUsuario = mensagemParaUsuario;
    }

    public String getOrigin() {
        return origin;
    }

    public String getSituacaoRequest() {
        return situacaoRequest;
    }

    public String getMensagemParaUsuario() {
        return mensagemParaUsuario;
    }
}
