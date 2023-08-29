package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.api.base.BaseAPI;
import br.com.fran.descomplica.filmeflix.dto.AssistirFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.FilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.FiltroPesquisarFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.dto.ResultadoPesquisaFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.dto.cadastro.FilmeCadastroDTO;
import br.com.fran.descomplica.filmeflix.service.FilmeService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/filmes")
public class FilmeAPI extends BaseAPI {

    private final FilmeService filmeService;

    @Autowired
    public FilmeAPI(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @PostMapping
    public ResponseEntity<ResponseDTO<FilmeDTO>> incluir(@RequestBody @Valid FilmeCadastroDTO filmeDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeService.incluir(filmeDTO));
    }

    @GetMapping("/assistir/{id}")
    public ResponseEntity<AssistirFilmeDTO> assistirFilme(@PathVariable("id") Long id) {
        return ResponseEntity.ok(filmeService.assistirFilme(id, getUsuarioLogado()));
    }

    @GetMapping("/pesquisar")
    public ResponseEntity<List<ResultadoPesquisaFilmeDTO>> pesquisarFilme(FiltroPesquisarFilmeDTO pesquisaFilmeDTO) {
        return ResponseEntity.ok(filmeService.pesquisarFilme(pesquisaFilmeDTO));
    }

    @GetMapping("/select-itens")
    public ResponseEntity<List<EntidadeDominioDTO>> listarSelectItem() {
        return ResponseEntity.ok(filmeService.listarSelectItem());
    }

}
