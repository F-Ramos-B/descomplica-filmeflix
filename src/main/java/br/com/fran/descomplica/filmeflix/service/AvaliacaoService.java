package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.mapper.AvaliacaoMapper;
import br.com.fran.descomplica.filmeflix.model.Avaliacao;
import br.com.fran.descomplica.filmeflix.repository.AvaliacaoRepository;
import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService extends BaseService<Avaliacao, Long, AvaliacaoDTO, AvaliacaoMapper, AvaliacaoRepository> {

    @Autowired
    public AvaliacaoService(AvaliacaoRepository avaliacaoRepository) {
        super(avaliacaoRepository, AvaliacaoMapper.INSTANCE);
    }

    public ResponseDTO<AvaliacaoDTO> incluirAvaliacao(AvaliacaoDTO avaliacaoDTO) {
        Avaliacao avaliacao = repository.save(mapper.toEntity(avaliacaoDTO));

        return new ResponseDTO<>("Avaliação incluída com sucesso.", mapper.toDTO(avaliacao));
    }

}
