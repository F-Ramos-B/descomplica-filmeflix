package br.com.fran.descomplica.filmeflix.dto;

import br.com.fran.descomplica.filmeflix.dto.base.BaseFilmeDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistFilmeDTO extends BaseFilmeDTO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dataInclusaoPlaylist;

}
