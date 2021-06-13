package br.com.zup.transacoes.lister;


import br.com.zup.transacoes.transacao.EventoDeTransacaoRequest;
import br.com.zup.transacoes.transacao.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacaoRequest eventoDeTransacao) {
        transacaoRepository.save(eventoDeTransacao.toModel());
    }
}