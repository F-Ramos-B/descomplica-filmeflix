package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.dto.AtorDTO;
import br.com.fran.descomplica.filmeflix.service.AtorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/atores")
public class AtorAPI {

    private final AtorService atorService;

    @Autowired
    public AtorAPI(AtorService atorService) {
        this.atorService = atorService;
    }

    @GetMapping
    public ResponseEntity<List<AtorDTO>> listarAtores() {
        return ResponseEntity.ok(atorService.listar());
    }

}
