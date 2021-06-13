package br.com.zup.transacoes.transacao.Estabelecimento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Estabelecimento() {
    }



    private String nome;

    private String cidade;

    private  String endereco;

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }
    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }
}
