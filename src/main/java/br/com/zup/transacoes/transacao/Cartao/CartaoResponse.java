package br.com.zup.transacoes.transacao.Cartao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CartaoResponse {

    private String email;

    public CartaoResponse() {
    }

    public String getEmail() {
        return email;
    }

    public CartaoResponse(Cartao cartao) {
        this.email = cartao.getEmail();
    }
}
