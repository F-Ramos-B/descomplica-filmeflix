package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.ResultadoPesquisaFilmeDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Avaliacao;
import br.com.fran.descomplica.filmeflix.model.Filme;
import java.util.List;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface ResultadoPesquisaFilmeMapper extends BaseMapper<Filme, ResultadoPesquisaFilmeDTO> {

    ResultadoPesquisaFilmeMapper INSTANCE = Mappers.getMapper(ResultadoPesquisaFilmeMapper.class);

    @AfterMapping
    default void inserirMediaAvaliacoes(@MappingTarget ResultadoPesquisaFilmeDTO dto, Filme entity) {
        List<Avaliacao> avaliacoes = entity.getAvaliacoes();

        if (CollectionUtils.isEmpty(avaliacoes)) {
            return;
        }

        avaliacoes.stream()
                .mapToInt(Avaliacao::getNota)
                .average()
                .ifPresent(dto::setMediaAvaliacoes);

    }

}
