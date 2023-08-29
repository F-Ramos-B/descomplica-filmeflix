package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.api.base.BaseCrudAPI;
import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/generos")
public class GeneroAPI extends BaseCrudAPI<Long, EntidadeDominioDTO, GeneroService> {

    @Autowired
    public GeneroAPI(GeneroService service) {
        super(service);
    }

}
