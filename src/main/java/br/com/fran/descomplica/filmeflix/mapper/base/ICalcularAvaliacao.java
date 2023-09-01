package br.com.fran.descomplica.filmeflix.mapper.base;

import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;

public interface ICalcularAvaliacao {

    default double calcularMediaAvaliacoes(List<AvaliacaoDTO> avaliacoes) {
        if (CollectionUtils.isEmpty(avaliacoes)) {
            return 0.0;
        }

        return avaliacoes.stream().collect(Collectors.averagingInt(AvaliacaoDTO::getNota));
    }

    default AvaliacaoDTO recuperarAvaliacaoUsuarioLogado(List<AvaliacaoDTO> avaliacoes, Long idUsuarioLogado) {
        if (CollectionUtils.isEmpty(avaliacoes)) {
            return null;
        }

        return avaliacoes.stream()
                .filter(avaliacao -> Objects.equals(avaliacao.getUsuario().getId(), idUsuarioLogado))
                .findFirst()
                .orElse(null);
    }

}
