package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.api.base.BaseCrudAPI;
import br.com.fran.descomplica.filmeflix.dto.EstadoDTO;
import br.com.fran.descomplica.filmeflix.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/estados")
public class EstadoAPI extends BaseCrudAPI<Long, EstadoDTO, EstadoService> {

    @Autowired
    public EstadoAPI(EstadoService service) {
        super(service);
    }

}
