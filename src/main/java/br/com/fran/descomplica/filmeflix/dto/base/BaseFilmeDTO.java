package br.com.fran.descomplica.filmeflix.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseFilmeDTO {

    private Long id;
    private String titulo;
    private int anoPublicacao;
    private String descricao;
    private int numeroVisualizacoes;
    private String linkImagem;
    private String linkFilme;
    private int classificacaoIndicativa;

    @JsonProperty("tituloAnoPublicacao")
    public String getTituloAnoPublicacao() {
        return String.format("%s (%d)", titulo, anoPublicacao);
    }

}
