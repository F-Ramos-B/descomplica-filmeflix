package br.com.fran.descomplica.filmeflix.dto;

import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AtorDTO extends EntidadeDominioDTO {

    private String sobrenome;

}
