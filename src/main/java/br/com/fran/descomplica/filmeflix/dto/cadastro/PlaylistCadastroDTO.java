package br.com.fran.descomplica.filmeflix.dto.cadastro;

import br.com.fran.descomplica.filmeflix.dto.base.BasePlaylistDTO;
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
public class PlaylistCadastroDTO extends BasePlaylistDTO {

    private Set<Long> filmes = new HashSet<>();

}
