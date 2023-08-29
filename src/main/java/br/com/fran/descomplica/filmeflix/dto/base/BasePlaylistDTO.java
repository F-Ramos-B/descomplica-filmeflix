package br.com.fran.descomplica.filmeflix.dto.base;

import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasePlaylistDTO {

    private Long id;
    private String nome;
    private String descricao;
    private String linkImagem;

    @JsonProperty("criador")
    private UsuarioDTO usuario;

}
