package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.PlataformaDTO;
import br.com.fran.descomplica.filmeflix.mapper.PlataformaMapper;
import br.com.fran.descomplica.filmeflix.repository.PlataformaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlataformaService {

    private final PlataformaRepository plataformaRepository;

    @Autowired
    public PlataformaService(PlataformaRepository plataformaRepository) {
        this.plataformaRepository = plataformaRepository;
    }

    public List<PlataformaDTO> listarPlataformas() {
        return PlataformaMapper.INSTANCE.toDTOList(plataformaRepository.findAll());
    }

}
