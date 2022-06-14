package com.somnus.controller.impl;

import com.somnus.controller.UsuarioController;
import com.somnus.models.request.UsuarioContractRequest;
import com.somnus.models.response.ContractResponse;
import org.jboss.resteasy.reactive.RestResponse;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/usuario")
public class UsuarioControllerImpl implements UsuarioController {


    @POST
    @Path("/cadastrar-usuario")
    public RestResponse<ContractResponse> cadastrarUsuario(UsuarioContractRequest userDataRequest) {
        ContractResponse response = new ContractResponse("local", "sucesso", "Usuario com nome: "+userDataRequest.getNome() + "cadastrado com sucesso");
        return  RestResponse.ok(response);
    }
}
