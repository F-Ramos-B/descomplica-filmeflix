package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Genero;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GeneroMapper extends BaseMapper<Genero, EntidadeDominioDTO> {

    GeneroMapper INSTANCE = Mappers.getMapper(GeneroMapper.class);

}
