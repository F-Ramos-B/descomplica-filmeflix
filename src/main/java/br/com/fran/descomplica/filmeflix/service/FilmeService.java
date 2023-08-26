package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.AssistirFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.FilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.FiltroPesquisarFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.dto.ResultadoPesquisaFilmeDTO;
import br.com.fran.descomplica.filmeflix.dto.cadastro.FilmeCadastroDTO;
import br.com.fran.descomplica.filmeflix.mapper.AssistirFilmeMapper;
import br.com.fran.descomplica.filmeflix.mapper.FilmeCadastroMapper;
import br.com.fran.descomplica.filmeflix.mapper.FilmeMapper;
import br.com.fran.descomplica.filmeflix.mapper.ResultadoPesquisaFilmeMapper;
import br.com.fran.descomplica.filmeflix.model.Filme;
import br.com.fran.descomplica.filmeflix.model.Usuario;
import br.com.fran.descomplica.filmeflix.repository.FilmeRepository;
import br.com.fran.descomplica.filmeflix.repository.specifications.PesquisaFilmeSpecification;
import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService extends BaseService<Filme, Long, FilmeDTO, FilmeMapper, FilmeRepository> {

    @Autowired
    public FilmeService(FilmeRepository filmeRepository) {
        super(filmeRepository, FilmeMapper.INSTANCE);
    }

    public ResponseDTO<FilmeDTO> incluir(FilmeCadastroDTO filmeDTO) {
        Filme filme = repository.save(FilmeCadastroMapper.INSTANCE.toNovoFilme(filmeDTO));

        return new ResponseDTO<>("Filme cadastrado com sucesso.", FilmeMapper.INSTANCE.toDTO(filme));
    }

    public AssistirFilmeDTO assistirFilme(Long idFilme, Usuario usuario) {
        Filme filme = requireNotEmpty(repository.findById(idFilme));

//        if (usuario.getIdade() < filme.getClassificacaoIndicativa()) {
//            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Usuário não tem idade suficiente para ver filme");
//        }
        filme.incrementarVisualizacoes();
        filme = repository.save(filme);

        return AssistirFilmeMapper.INSTANCE.toDTO(filme, usuario.getId());
    }

    public List<ResultadoPesquisaFilmeDTO> pesquisarFilme(FiltroPesquisarFilmeDTO pesquisaFilmeDTO) {
        List<Filme> filmes = repository.findAll(new PesquisaFilmeSpecification(pesquisaFilmeDTO));

        return ResultadoPesquisaFilmeMapper.INSTANCE.toDTOList(filmes);
    }


}
