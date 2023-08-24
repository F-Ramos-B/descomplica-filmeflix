package br.com.fran.descomplica.filmeflix.dto;

import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.util.IIdade;
import br.com.fran.descomplica.filmeflix.util.INomeCompleto;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AtorDTO extends EntidadeDominioDTO implements IIdade, INomeCompleto {

    private String sobrenome;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

}
