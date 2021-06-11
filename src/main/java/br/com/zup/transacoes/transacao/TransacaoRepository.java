package br.com.zup.transacoes.transacao;

import org.springframework.data.repository.CrudRepository;

public interface TransacaoRepository
        extends CrudRepository<EventoDeTransacao, String> {
}
