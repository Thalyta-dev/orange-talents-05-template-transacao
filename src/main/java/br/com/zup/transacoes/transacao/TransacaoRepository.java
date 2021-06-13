package br.com.zup.transacoes.transacao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransacaoRepository
        extends PagingAndSortingRepository<EventoDeTransacao, String> {

    Page<EventoDeTransacao> findByCartaoId(String id, Pageable paginacao);
}