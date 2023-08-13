package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.RegistroDTO;
import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.Usuario;
import java.util.function.UnaryOperator;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper extends BaseMapper<Usuario, UsuarioDTO> {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    default Usuario toNovoUsuario(RegistroDTO registroDTO, UnaryOperator<String> passwordEncoderOperation) {
        Usuario usuario = this.toEntity(registroDTO);

        usuario.setSenha(passwordEncoderOperation.apply(registroDTO.getSenha()));

        return usuario;
    }

}
