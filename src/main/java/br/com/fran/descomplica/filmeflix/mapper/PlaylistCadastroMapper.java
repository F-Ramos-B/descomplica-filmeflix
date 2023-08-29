package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.cadastro.PlaylistCadastroDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import br.com.fran.descomplica.filmeflix.model.Playlist;
import br.com.fran.descomplica.filmeflix.model.PlaylistFilme;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = UsuarioMapper.class, collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface PlaylistCadastroMapper extends BaseMapper<Playlist, PlaylistCadastroDTO> {

    PlaylistCadastroMapper INSTANCE = Mappers.getMapper(PlaylistCadastroMapper.class);

    @Override
    @Mapping(target = "filmes", ignore = true)
    Playlist toEntity(PlaylistCadastroDTO dto);

    @Override
    @Mapping(target = "filmes", ignore = true)
    PlaylistCadastroDTO toDTO(Playlist entity);

    @AfterMapping
    default void toNovaPlaylist(@MappingTarget Playlist playlist, PlaylistCadastroDTO dto) {
        dto.getFilmes().forEach(idFilme -> playlist.getFilmes().add(new PlaylistFilme(new Filme(idFilme), playlist)));
    }

}
