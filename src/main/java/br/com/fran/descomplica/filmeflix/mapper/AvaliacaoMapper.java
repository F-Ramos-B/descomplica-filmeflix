package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.AvaliacaoDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Avaliacao;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = UsuarioMapper.class)
public interface AvaliacaoMapper extends BaseMapper<Avaliacao, AvaliacaoDTO> {

    AvaliacaoMapper INSTANCE = Mappers.getMapper(AvaliacaoMapper.class);

}
