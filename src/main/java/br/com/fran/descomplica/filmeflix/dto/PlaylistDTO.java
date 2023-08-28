package br.com.fran.descomplica.filmeflix.dto;

import br.com.fran.descomplica.filmeflix.model.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistDTO {

    private Long id;
    private String nome;
    private List<PlaylistFilmeDTO> filmes = new ArrayList<>();
    private List<AvaliacaoDTO> avaliacoes = new ArrayList<>();

    @JsonProperty("criador")
    private Usuario usuario;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime updatedAt;

}
