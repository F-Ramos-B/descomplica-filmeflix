package br.com.fran.descomplica.filmeflix.api.base;

import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import br.com.fran.descomplica.filmeflix.mapper.UsuarioMapper;
import br.com.fran.descomplica.filmeflix.model.Usuario;
import org.springframework.security.core.context.SecurityContextHolder;

public abstract class BaseAPI {

    public String getEmailUsuarioLogado() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    public Usuario getUsuarioLogado() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return principal instanceof Usuario ? (Usuario) principal : null;
    }

    public UsuarioDTO getUsuarioLogadoDTO() {
        return UsuarioMapper.INSTANCE.toDTO(this.getUsuarioLogado());
    }

}
