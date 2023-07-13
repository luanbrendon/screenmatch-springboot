package com.desenvolve.screenmatch.model.filme;

import org.springframework.core.StandardReflectionParameterNameDiscoverer;

public class Filme {
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;

    public Filme(dadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();

    }

    public String toString() {
        return "Filme{"+
                "nome+'" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\''+
                '}';
    }
}
