package br.com.zup.transacoes.transacao;

import br.com.zup.transacoes.transacao.Cartao.Cartao;
import br.com.zup.transacoes.transacao.Estabelecimento.Estabelecimento;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class EventoDeTransacao {

    @Id
    private String id;

    @Positive
    private BigDecimal valor;

    @ManyToOne(cascade = CascadeType.ALL)
    private Estabelecimento estabelecimento;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    private LocalDateTime efetivadaEm;

    public EventoDeTransacao() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EventoDeTransacao(String id, BigDecimal valor,
                             Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }
}
