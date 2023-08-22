package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.AtorDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Ator;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AtorMapper extends BaseMapper<Ator, AtorDTO> {

    AtorMapper INSTANCE = Mappers.getMapper(AtorMapper.class);

}
