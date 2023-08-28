package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.PlaylistFilmeDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.PlaylistFilme;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface PlaylistFilmeMapper extends BaseMapper<PlaylistFilme, PlaylistFilmeDTO> {

    PlaylistFilmeMapper INSTANCE = Mappers.getMapper(PlaylistFilmeMapper.class);

    @Override
    @Mapping(source = "createdAt", target = "dataInclusaoPlaylist")
    @Mapping(source = "playlistFilmePK.filme", target = ".")
    PlaylistFilmeDTO toDTO(PlaylistFilme entity);

}
