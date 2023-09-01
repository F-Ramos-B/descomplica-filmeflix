package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.AssistirFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import br.com.fran.descomplica.filmeflix.mapper.base.ICalcularAvaliacao;

@Mapper(uses = {
    GeneroMapper.class, PlataformaMapper.class, AtorMapper.class, AvaliacaoMapper.class
}, collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface AssistirFilmeMapper extends BaseMapper<Filme, AssistirFilmeDTO>, ICalcularAvaliacao {

    AssistirFilmeMapper INSTANCE = Mappers.getMapper(AssistirFilmeMapper.class);

    AssistirFilmeDTO toDTO(Filme entity, Long idUsuarioLogado);

    @AfterMapping
    default void inserirMediaAvaliacoes(@MappingTarget AssistirFilmeDTO dto) {
        dto.setMediaAvaliacoes(this.calcularMediaAvaliacoes(dto.getAvaliacoes()));
    }

    @AfterMapping
    default void inserirAvaliacaoUsuarioLogado(@MappingTarget AssistirFilmeDTO dto, Long idUsuarioLogado) {
        AvaliacaoDTO avaliacaoUsuarioLogado = this.recuperarAvaliacaoUsuarioLogado(dto.getAvaliacoes(), idUsuarioLogado);

        dto.setAvaliacaoUsuarioLogado(avaliacaoUsuarioLogado);
        dto.getAvaliacoes().remove(avaliacaoUsuarioLogado);
    }

}
