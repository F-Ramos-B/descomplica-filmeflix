package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.api.base.BaseCrudAPI;
import br.com.fran.descomplica.filmeflix.dto.AtorDTO;
import br.com.fran.descomplica.filmeflix.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/atores")
public class AtorAPI extends BaseCrudAPI<Long, AtorDTO, AtorService> {

    @Autowired
    public AtorAPI(AtorService service) {
        super(service);
    }

}
