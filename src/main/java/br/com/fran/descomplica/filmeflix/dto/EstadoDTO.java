package br.com.fran.descomplica.filmeflix.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDTO {

    private Long id;
    private String uf;
    private String nome;

}
