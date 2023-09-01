package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.api.base.BaseCrudAPI;
import br.com.fran.descomplica.filmeflix.dto.PlaylistDTO;
import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.dto.cadastro.PlaylistCadastroDTO;
import br.com.fran.descomplica.filmeflix.service.PlaylistService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/playlists")
public class PlaylistAPI extends BaseCrudAPI<Long, PlaylistDTO, PlaylistService> {

    @Autowired
    public PlaylistAPI(PlaylistService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<ResponseDTO<PlaylistDTO>> incluir(@RequestBody @Valid PlaylistCadastroDTO playlistCadastroDTO) {
        playlistCadastroDTO.setUsuario(this.getUsuarioLogadoDTO());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.incluir(playlistCadastroDTO));
    }

    @Override
    public ResponseEntity<PlaylistDTO> listarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.buscarPorId(id, this.getUsuarioLogadoDTO()));
    }

}
