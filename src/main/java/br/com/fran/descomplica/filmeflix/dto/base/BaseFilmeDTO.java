package br.com.fran.descomplica.filmeflix.dto.base;

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
    private String descricao;
    private int numeroVisualizacoes = 0;
    private String linkImagem;
    private String linkFilme;
    private int classificacaoIndicativa;

}
