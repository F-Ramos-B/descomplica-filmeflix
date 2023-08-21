package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.mapper.GeneroMapper;
import br.com.fran.descomplica.filmeflix.model.Genero;
import br.com.fran.descomplica.filmeflix.repository.GeneroRepository;
import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService extends BaseService<Genero, Long, EntidadeDominioDTO, GeneroMapper, GeneroRepository> {

    @Autowired
    public GeneroService(GeneroRepository repository) {
        super(repository, GeneroMapper.INSTANCE);
    }

}
