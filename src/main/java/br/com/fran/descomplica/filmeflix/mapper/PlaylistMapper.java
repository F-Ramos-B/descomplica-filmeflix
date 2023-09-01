package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.dto.PlaylistDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.mapper.base.ICalcularAvaliacao;
import br.com.fran.descomplica.filmeflix.model.Playlist;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
    PlaylistFilmeMapper.class, UsuarioMapper.class, AvaliacaoMapper.class
}, collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface PlaylistMapper extends BaseMapper<Playlist, PlaylistDTO>, ICalcularAvaliacao {

    PlaylistMapper INSTANCE = Mappers.getMapper(PlaylistMapper.class);

    PlaylistDTO toDTO(Playlist entity, Long idUsuarioLogado);

    @AfterMapping
    default void inserirMediaAvaliacoes(@MappingTarget PlaylistDTO dto) {
        dto.setMediaAvaliacoes(this.calcularMediaAvaliacoes(dto.getAvaliacoes()));
    }

    @AfterMapping
    default void inserirAvaliacaoUsuarioLogado(@MappingTarget PlaylistDTO dto, Long idUsuarioLogado) {
        AvaliacaoDTO avaliacaoUsuarioLogado = this.recuperarAvaliacaoUsuarioLogado(dto.getAvaliacoes(), idUsuarioLogado);

        dto.setAvaliacaoUsuarioLogado(avaliacaoUsuarioLogado);
        dto.getAvaliacoes().remove(avaliacaoUsuarioLogado);
    }

}
