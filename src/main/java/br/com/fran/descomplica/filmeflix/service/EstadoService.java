package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.EstadoDTO;
import br.com.fran.descomplica.filmeflix.mapper.EstadoMapper;
import br.com.fran.descomplica.filmeflix.model.Estado;
import br.com.fran.descomplica.filmeflix.repository.EstadoRepository;
import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService extends BaseService<Estado, Long, EstadoDTO, EstadoMapper, EstadoRepository> {

    @Autowired
    public EstadoService(EstadoRepository estadoRepository) {
        super(estadoRepository, EstadoMapper.INSTANCE);
    }

}
