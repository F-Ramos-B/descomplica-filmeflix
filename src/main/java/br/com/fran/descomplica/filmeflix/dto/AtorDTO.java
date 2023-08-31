package br.com.fran.descomplica.filmeflix.dto;

import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.util.IIdade;
import br.com.fran.descomplica.filmeflix.util.INomeCompleto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    private String biografia;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

    @JsonProperty("textoSelect")
    public String getTextoSelect() {
        return this.getNomeCompleto() + String.format(" (%d anos)", this.getIdade());
    }

}
