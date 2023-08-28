package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.PlaylistDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Playlist;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
    PlaylistFilmeMapper.class, UsuarioMapper.class, AvaliacaoMapper.class
}, collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface PlaylistMapper extends BaseMapper<Playlist, PlaylistDTO> {

    PlaylistMapper INSTANCE = Mappers.getMapper(PlaylistMapper.class);

}
