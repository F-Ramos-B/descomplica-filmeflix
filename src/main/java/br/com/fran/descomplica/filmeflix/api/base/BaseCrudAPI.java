package br.com.fran.descomplica.filmeflix.api.base;

import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class BaseCrudAPI<ID, DTO, S extends BaseService<?, ID, DTO, ?, ?>> extends BaseAPI {

    protected final S service;

    protected BaseCrudAPI(S service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DTO>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DTO> listarPorId(@PathVariable("id") ID id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

}
