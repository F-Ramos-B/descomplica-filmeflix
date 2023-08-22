package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.AssistirFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import java.math.BigDecimal;
import java.util.List;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ResponseStatusException;

@Mapper(uses = {
    GeneroMapper.class, PlataformaMapper.class, AtorMapper.class, AvaliacaoMapper.class
})
public interface AssistirFilmeMapper extends BaseMapper<Filme, AssistirFilmeDTO> {

    AssistirFilmeMapper INSTANCE = Mappers.getMapper(AssistirFilmeMapper.class);

    @AfterMapping
    default void inserirMediaAvaliacoes(@MappingTarget AssistirFilmeDTO dto) {
        List<AvaliacaoDTO> avaliacoes = dto.getAvaliacoes();

        if (CollectionUtils.isEmpty(avaliacoes)) {
            return;
        }

        BigDecimal quantidadeAvaliacoes = new BigDecimal(avaliacoes.size());
        
//        avaliacoes.stream()
//                .mapToInt(avaliacao -> avaliacao.getNota())
//                .average();
        
        BigDecimal mediaAvaliacoes = avaliacoes.stream()
                .map(avaliacao -> new BigDecimal(avaliacao.getNota()))
                .reduce(BigDecimal::add)
                .map(total -> total.divide(quantidadeAvaliacoes))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao calcular media de avaliações"));

        dto.setMediaAvaliacoes(mediaAvaliacoes);
    }

}
