package br.com.fran.descomplica.filmeflix.dto;

import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FiltroPesquisarFilmeDTO {

    private String titulo;
    private String descricao;
    private Integer anoPublicacaoMin;
    private Integer anoPublicacaoMax;
    private Integer classificacaoIndicativaMin;
    private Integer classificacaoIndicativaMax;
    private Set<Long> generos = new HashSet<>();
    private Long plataforma;

}
