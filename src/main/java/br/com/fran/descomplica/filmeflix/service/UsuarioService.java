package br.com.fran.descomplica.filmeflix.service;

import br.com.fran.descomplica.filmeflix.dto.MensagemDTO;
import br.com.fran.descomplica.filmeflix.dto.RegistroDTO;
import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import br.com.fran.descomplica.filmeflix.enums.EnumPerfil;
import br.com.fran.descomplica.filmeflix.mapper.UsuarioMapper;
import br.com.fran.descomplica.filmeflix.model.Usuario;
import br.com.fran.descomplica.filmeflix.repository.UsuarioRepository;
import br.com.fran.descomplica.filmeflix.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService, ResultUtils {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public MensagemDTO<UsuarioDTO> registrar(RegistroDTO registroDTO, EnumPerfil perfil) {
        Usuario usuario = UsuarioMapper.INSTANCE.toNovoUsuario(registroDTO, passwordEncoder::encode);

        usuario.setPerfil(perfil);

        UsuarioDTO usuarioDTO = UsuarioMapper.INSTANCE.toDTO(usuarioRepository.save(usuario));

        return new MensagemDTO<>("Usuário criado com sucesso!", usuarioDTO);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return requireNotEmpty(usuarioRepository.findByEmail(username));
    }

}
