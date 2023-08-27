package br.com.fran.descomplica.filmeflix.dto.cadastro;

import br.com.fran.descomplica.filmeflix.dto.base.BaseFilmeDTO;
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
public class FilmeCadastroDTO extends BaseFilmeDTO {

    private Set<Long> generos = new HashSet<>();
    private Set<Long> atores = new HashSet<>();
    private Long plataforma;

}
