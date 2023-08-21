package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.dto.PlataformaDTO;
import br.com.fran.descomplica.filmeflix.service.PlataformaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/plataformas")
public class PlataformaAPI {

    private final PlataformaService plataformaService;

    @Autowired
    public PlataformaAPI(PlataformaService plataformaService) {
        this.plataformaService = plataformaService;
    }

    @GetMapping
    public ResponseEntity<List<PlataformaDTO>> listarPlataformas() {
        return ResponseEntity.ok(plataformaService.listarPlataformas());
    }

}
