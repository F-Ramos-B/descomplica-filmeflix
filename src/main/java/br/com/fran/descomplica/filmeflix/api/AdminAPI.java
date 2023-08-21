package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.dto.cadastro.RegistroDTO;
import br.com.fran.descomplica.filmeflix.dto.UsuarioDTO;
import br.com.fran.descomplica.filmeflix.enums.EnumPerfil;
import br.com.fran.descomplica.filmeflix.service.UsuarioService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/admins")
public class AdminAPI {

    private final UsuarioService usuarioService;

    @Autowired
    public AdminAPI(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<ResponseDTO<UsuarioDTO>> registrar(@RequestBody @Valid RegistroDTO registroDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.registrar(registroDTO, EnumPerfil.ADMIN));
    }

}
