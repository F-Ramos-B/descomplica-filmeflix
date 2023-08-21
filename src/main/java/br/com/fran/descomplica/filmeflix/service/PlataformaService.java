package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.PlataformaDTO;
import br.com.fran.descomplica.filmeflix.mapper.PlataformaMapper;
import br.com.fran.descomplica.filmeflix.model.Plataforma;
import br.com.fran.descomplica.filmeflix.repository.PlataformaRepository;
import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlataformaService extends BaseService<Plataforma, Long, PlataformaDTO, PlataformaMapper, PlataformaRepository> {

    @Autowired
    public PlataformaService(PlataformaRepository repository) {
        super(repository, PlataformaMapper.INSTANCE);
    }

}
