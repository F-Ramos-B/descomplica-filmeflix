package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.EstadoDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Estado;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EstadoMapper extends BaseMapper<Estado, EstadoDTO> {

    EstadoMapper INSTANCE = Mappers.getMapper(EstadoMapper.class);

}
