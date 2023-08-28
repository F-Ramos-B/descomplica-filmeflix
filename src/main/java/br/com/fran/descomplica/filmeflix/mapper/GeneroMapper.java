package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.base.EntidadeDominioDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Genero;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface GeneroMapper extends BaseMapper<Genero, EntidadeDominioDTO> {

    GeneroMapper INSTANCE = Mappers.getMapper(GeneroMapper.class);

}
