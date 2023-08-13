package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.RegistroDTO;
import br.com.fran.descomplica.filmeflix.mapper.UsuarioMapper;
import br.com.fran.descomplica.filmeflix.model.Usuario;
import br.com.fran.descomplica.filmeflix.repository.PerfilRepository;
import br.com.fran.descomplica.filmeflix.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UsuarioService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final PerfilRepository perfilRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository, PerfilRepository perfilRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.perfilRepository = perfilRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public RegistroDTO registrar(RegistroDTO registroDTO) {

        Usuario usuario = UsuarioMapper.toNovoUsuario(registroDTO, passwordEncoder);

        usuario.setPerfil(perfilRepository.getById(1L));

        usuarioRepository.save(usuario);

        return registroDTO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(username).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
