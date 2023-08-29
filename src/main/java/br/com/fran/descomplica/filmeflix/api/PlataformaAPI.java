package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.api.base.BaseCrudAPI;
import br.com.fran.descomplica.filmeflix.dto.PlataformaDTO;
import br.com.fran.descomplica.filmeflix.service.PlataformaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/plataformas")
public class PlataformaAPI extends BaseCrudAPI<Long, PlataformaDTO, PlataformaService> {

    @Autowired
    public PlataformaAPI(PlataformaService service) {
        super(service);
    }

}
