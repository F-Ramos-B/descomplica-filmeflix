package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.RegistroDTO;
import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import br.com.fran.descomplica.filmeflix.model.Usuario;
import org.springframework.security.crypto.password.PasswordEncoder;

public abstract class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setApelido(usuario.getApelido());
        usuarioDTO.setDataNascimento(usuario.getDataNascimento());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setGenero(usuario.getGenero());
        usuarioDTO.setNome(usuario.getNome());

        return usuarioDTO;
    }

    public static Usuario toNovoUsuario(RegistroDTO registroDTO, PasswordEncoder passwordEncoder) {
        Usuario usuario = new Usuario();

        usuario.setApelido(registroDTO.getApelido());
        usuario.setDataNascimento(registroDTO.getDataNascimento());
        usuario.setEmail(registroDTO.getEmail());
        usuario.setGenero(registroDTO.getGenero());
        usuario.setNome(registroDTO.getNome());
        usuario.setSenha(passwordEncoder.encode(registroDTO.getSenha()));

        return usuario;
    }

}
