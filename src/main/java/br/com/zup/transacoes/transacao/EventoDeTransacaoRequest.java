package br.com.zup.transacoes.transacao;

import br.com.zup.transacoes.transacao.Cartao.Cartao;
import br.com.zup.transacoes.transacao.Cartao.CartaoRequest;
import br.com.zup.transacoes.transacao.Estabelecimento.Estabelecimento;
import br.com.zup.transacoes.transacao.Estabelecimento.EstabelecimentoRequest;

import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacaoRequest {


    private String id;

    @Positive
    private BigDecimal valor;

    private EstabelecimentoRequest estabelecimento;

    private CartaoRequest cartao;

    private LocalDateTime efetivadaEm;

    public EventoDeTransacaoRequest() {
    }

    public EventoDeTransacaoRequest(String id, BigDecimal valor,
                                    EstabelecimentoRequest estabelecimento, CartaoRequest cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;

    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoRequest getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoRequest getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EventoDeTransacao toModel(){
        Estabelecimento estabelecimento = this.estabelecimento.toModel();
        Cartao cartao = this.cartao.toModel();
        return  new EventoDeTransacao(id,valor,estabelecimento,cartao,efetivadaEm);
    }
}
