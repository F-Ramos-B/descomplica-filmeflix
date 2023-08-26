package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Avaliacao;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = UsuarioMapper.class)
public interface AvaliacaoMapper extends BaseMapper<Avaliacao, AvaliacaoDTO> {

    AvaliacaoMapper INSTANCE = Mappers.getMapper(AvaliacaoMapper.class);

    @Override
    @Mapping(source = "filme.id", target = "idFilme")
    @Mapping(source = "playlist.id", target = "idPlaylist")
    AvaliacaoDTO toDTO(Avaliacao entity);

    @Override
    @Mapping(source = "idFilme", target = "filme.id")
    @Mapping(source = "idPlaylist", target = "playlist.id")
    Avaliacao toEntity(AvaliacaoDTO dto);

    @AfterMapping
    default Avaliacao afterMapping(@MappingTarget Avaliacao avaliacao, AvaliacaoDTO avaliacaoDTO) {
        if (avaliacaoDTO.getIdFilme() == null) {
            avaliacao.setFilme(null);
        }

        if (avaliacaoDTO.getIdPlaylist() == null) {
            avaliacao.setPlaylist(null);
        }

        return avaliacao;
    }

}
