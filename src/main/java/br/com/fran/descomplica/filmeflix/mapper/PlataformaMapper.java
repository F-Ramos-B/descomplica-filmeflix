package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.PlataformaDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Plataforma;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlataformaMapper extends BaseMapper<Plataforma, PlataformaDTO> {

    PlataformaMapper INSTANCE = Mappers.getMapper(PlataformaMapper.class);

}
