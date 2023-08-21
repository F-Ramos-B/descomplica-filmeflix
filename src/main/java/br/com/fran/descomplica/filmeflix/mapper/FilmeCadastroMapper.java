package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.base.BaseFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.cadastro.FilmeCadastroDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import br.com.fran.descomplica.filmeflix.model.Genero;
import br.com.fran.descomplica.filmeflix.model.Plataforma;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FilmeCadastroMapper extends BaseMapper<Filme, BaseFilmeDTO> {

    FilmeCadastroMapper INSTANCE = Mappers.getMapper(FilmeCadastroMapper.class);

    default Filme toNovoFilme(FilmeCadastroDTO filmeCadastroDTO) {
        Filme filme = this.toEntity(filmeCadastroDTO);

        filme.setPlataforma(new Plataforma(filmeCadastroDTO.getPlataforma()));

        filmeCadastroDTO.getGeneros().forEach(idGenero -> filme.getGeneros().add(new Genero(idGenero)));

        return filme;
    }

}
