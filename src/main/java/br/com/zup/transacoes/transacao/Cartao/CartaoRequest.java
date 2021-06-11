package br.com.zup.transacoes.transacao.Cartao;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CartaoRequest {

    @NotBlank
    private String id;

    @Email
    @NotBlank
    private String email;

    public CartaoRequest() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Cartao toModel(){
        return  new Cartao(id,email);
    }

}
