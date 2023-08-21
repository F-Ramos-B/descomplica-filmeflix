package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.service.GeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/generos")
public class GeneroAPI {

    private final GeneroService generoService;

    @Autowired
    public GeneroAPI(GeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping
    public ResponseEntity<List<EntidadeDominioDTO>> listarGeneros() {
        return ResponseEntity.ok(generoService.listar());
    }

}
