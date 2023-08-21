package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.dto.EstadoDTO;
import br.com.fran.descomplica.filmeflix.service.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/estados")
public class EstadoAPI {

    private final EstadoService estadoService;

    @Autowired
    public EstadoAPI(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public ResponseEntity<List<EstadoDTO>> listarEstados() {
        return ResponseEntity.ok(estadoService.listar());
    }

}
