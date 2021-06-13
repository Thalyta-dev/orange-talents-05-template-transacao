package br.com.zup.transacoes.transacao.Estabelecimento;

public class EstabelecimentoResponse {


    private String nome;

    private String cidade;

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public EstabelecimentoResponse(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
    }

}
