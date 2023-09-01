package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.PlaylistDTO;
import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import br.com.fran.descomplica.filmeflix.dto.cadastro.PlaylistCadastroDTO;
import br.com.fran.descomplica.filmeflix.mapper.PlaylistCadastroMapper;
import br.com.fran.descomplica.filmeflix.mapper.PlaylistMapper;
import br.com.fran.descomplica.filmeflix.model.Playlist;
import br.com.fran.descomplica.filmeflix.repository.PlaylistRepository;
import br.com.fran.descomplica.filmeflix.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlaylistDTO, PlaylistMapper, PlaylistRepository> {

    @Autowired
    public PlaylistService(PlaylistRepository playlistRepository) {
        super(playlistRepository, PlaylistMapper.INSTANCE);
    }

    public ResponseDTO<PlaylistDTO> incluir(PlaylistCadastroDTO playlistCadastroDTO) {
        Playlist playlist = repository.save(PlaylistCadastroMapper.INSTANCE.toEntity(playlistCadastroDTO));

        return new ResponseDTO<>("Playlist cadastrada com sucesso.", PlaylistMapper.INSTANCE.toDTO(playlist));
    }

    public PlaylistDTO buscarPorId(Long id, UsuarioDTO usuarioDTO) {
        return mapper.toDTO(requireNotEmpty(repository.findById(id)), usuarioDTO.getId());
    }

}
