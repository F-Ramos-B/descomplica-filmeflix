package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.mapper.GeneroMapper;
import br.com.fran.descomplica.filmeflix.repository.GeneroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    private final GeneroRepository generoRepository;

    @Autowired
    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    public List<EntidadeDominioDTO> listarGeneros() {
        return GeneroMapper.INSTANCE.toDTOList(generoRepository.findAll());
    }

}
