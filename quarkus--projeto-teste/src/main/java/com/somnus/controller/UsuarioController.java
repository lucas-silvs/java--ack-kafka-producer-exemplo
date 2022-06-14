package com.somnus.controller;

import com.somnus.models.request.UsuarioContractRequest;
import com.somnus.models.response.ContractResponse;
import org.jboss.resteasy.reactive.RestResponse;

public interface UsuarioController {

    RestResponse<ContractResponse> cadastrarUsuario(UsuarioContractRequest userDataRequest);


}
