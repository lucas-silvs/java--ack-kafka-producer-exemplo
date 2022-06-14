package com.somnus.models.request;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "login",
        "nome",
        "email",
        "cpf",
        "dataNascimento",
        "telefone",
        "senha"})
public class UsuarioContractRequest {

    private String login;
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private String senha;

    public UsuarioContractRequest(String nome, String email, String login, String cpf, String dataNascimento, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }
}
