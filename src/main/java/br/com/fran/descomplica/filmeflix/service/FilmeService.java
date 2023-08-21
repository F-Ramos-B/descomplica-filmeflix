package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.FilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.dto.cadastro.FilmeCadastroDTO;
import br.com.fran.descomplica.filmeflix.mapper.FilmeCadastroMapper;
import br.com.fran.descomplica.filmeflix.mapper.FilmeMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import br.com.fran.descomplica.filmeflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    private final FilmeRepository filmeRepository;

    @Autowired
    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public ResponseDTO<FilmeDTO> incluir(FilmeCadastroDTO filmeDTO) {
        Filme filme = filmeRepository.save(FilmeCadastroMapper.INSTANCE.toNovoFilme(filmeDTO));

        return new ResponseDTO<>("Filme cadastrado com sucesso.", FilmeMapper.INSTANCE.toDTO(filme));
    }

}
