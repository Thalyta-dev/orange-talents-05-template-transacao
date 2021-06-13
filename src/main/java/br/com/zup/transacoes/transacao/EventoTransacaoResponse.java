package br.com.zup.transacoes.transacao;

import br.com.zup.transacoes.transacao.Cartao.CartaoResponse;
import br.com.zup.transacoes.transacao.Estabelecimento.EstabelecimentoResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoTransacaoResponse {

    private BigDecimal valor;

    private EstabelecimentoResponse estabelecimento;

    private CartaoResponse cartao;

    private LocalDateTime efetivadaEm;

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EventoTransacaoResponse(EventoDeTransacao eventoDeTransacao) {
        this.valor = eventoDeTransacao.getValor();
        this.estabelecimento = new EstabelecimentoResponse(eventoDeTransacao.getEstabelecimento());
        this.cartao = new CartaoResponse(eventoDeTransacao.getCartao());
        this.efetivadaEm = eventoDeTransacao.getEfetivadaEm();
    }
}
