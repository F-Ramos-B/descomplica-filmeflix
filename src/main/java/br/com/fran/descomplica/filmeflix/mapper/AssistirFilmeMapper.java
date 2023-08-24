package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.AssistirFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import java.util.List;
import java.util.Objects;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

@Mapper(uses = {
    GeneroMapper.class, PlataformaMapper.class, AtorMapper.class, AvaliacaoMapper.class
})
public interface AssistirFilmeMapper extends BaseMapper<Filme, AssistirFilmeDTO> {

    AssistirFilmeMapper INSTANCE = Mappers.getMapper(AssistirFilmeMapper.class);

    public AssistirFilmeDTO toDTO(Filme entity, Long idUsuarioLogado);

    @AfterMapping
    default void inserirMediaAvaliacoes(@MappingTarget AssistirFilmeDTO dto) {
        List<AvaliacaoDTO> avaliacoes = dto.getAvaliacoes();

        if (CollectionUtils.isEmpty(avaliacoes)) {
            return;
        }

        avaliacoes.stream()
                .mapToInt(AvaliacaoDTO::getNota)
                .average()
                .ifPresent(dto::setMediaAvaliacoes);

    }

    @AfterMapping
    default void inserirAvaliacaoUsuarioLogado(@MappingTarget AssistirFilmeDTO dto, Long idUsuarioLogado) {
        List<AvaliacaoDTO> avaliacoes = dto.getAvaliacoes();

        if (CollectionUtils.isEmpty(avaliacoes)) {
            return;
        }

        avaliacoes.stream()
                .filter(avaliacao -> Objects.equals(avaliacao.getUsuario().getId(), idUsuarioLogado))
                .findFirst()
                .ifPresent(avaliacaoUsuarioLogado -> {
                    dto.setAvaliacaoUsuarioLogado(avaliacaoUsuarioLogado);
                    avaliacoes.remove(avaliacaoUsuarioLogado);
                });
    }

}
