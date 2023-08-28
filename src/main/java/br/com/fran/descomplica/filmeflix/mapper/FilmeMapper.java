package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.FilmeDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
    GeneroMapper.class, PlataformaMapper.class
}, collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface FilmeMapper extends BaseMapper<Filme, FilmeDTO> {

    FilmeMapper INSTANCE = Mappers.getMapper(FilmeMapper.class);

}
