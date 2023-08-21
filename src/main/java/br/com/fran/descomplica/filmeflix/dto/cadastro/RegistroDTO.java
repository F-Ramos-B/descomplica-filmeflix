package br.com.fran.descomplica.filmeflix.dto.cadastro;

import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistroDTO extends UsuarioDTO {

    private String senha;

}
