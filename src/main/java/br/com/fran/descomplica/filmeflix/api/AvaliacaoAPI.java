package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.api.base.BaseAPI;
import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoAPI extends BaseAPI {

    private final AvaliacaoService avaliacaoService;

    @Autowired
    public AvaliacaoAPI(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }

    @PostMapping
    public ResponseEntity<ResponseDTO<AvaliacaoDTO>> incluirAvaliacao(@RequestBody AvaliacaoDTO avaliacaoDTO) {
        avaliacaoDTO.setUsuario(this.getUsuarioLogadoDTO());
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoService.incluirAvaliacao(avaliacaoDTO));
    }

}
