package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.AtorDTO;
import br.com.fran.descomplica.filmeflix.mapper.AtorMapper;
import br.com.fran.descomplica.filmeflix.model.Ator;
import br.com.fran.descomplica.filmeflix.repository.AtorRepository;
import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtorService extends BaseService<Ator, Long, AtorDTO, AtorMapper, AtorRepository> {

    @Autowired
    public AtorService(AtorRepository atorRepository) {
        super(atorRepository, AtorMapper.INSTANCE);
    }

}
