package br.com.fran.descomplica.filmeflix.dto;

import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssistirFilmeDTO extends FilmeDTO {

    private List<AtorDTO> atores = new ArrayList<>();
    private List<AvaliacaoDTO> avaliacoes = new ArrayList<>();
    private AvaliacaoDTO avaliacaoUsuarioLogado;
    private double mediaAvaliacoes;

    @JsonProperty("linkExibicao")
    public String getLinkExibicao() {
        return getPlataforma().getLinkPrefixo() + getLinkFilme();
    }

    @JsonProperty("generosTexto")
    public String getGenerosTexto() {
        return getGeneros().stream().map(EntidadeDominioDTO::getNome).collect(Collectors.joining(", "));
    }

    @JsonProperty("atoresTexto")
    public String getAtoresTexto() {
        return getAtores().stream().map(AtorDTO::getNomeCompleto).collect(Collectors.joining(", "));
    }

}
