package br.com.fran.descomplica.filmeflix.api;

import br.com.fran.descomplica.filmeflix.config.security.TokenService;
import br.com.fran.descomplica.filmeflix.dto.AuthDTO;
import br.com.fran.descomplica.filmeflix.dto.LoginDTO;
import br.com.fran.descomplica.filmeflix.dto.RegistroDTO;
import br.com.fran.descomplica.filmeflix.mapper.UsuarioMapper;
import br.com.fran.descomplica.filmeflix.model.Usuario;
import br.com.fran.descomplica.filmeflix.service.UsuarioService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthAPI {

    private final AuthenticationManager authenticationManager;
    private final UsuarioService usuarioService;
    private final TokenService tokenService;

    @Autowired
    public AuthAPI(AuthenticationManager authenticationManager, UsuarioService usuarioService, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.usuarioService = usuarioService;
        this.tokenService = tokenService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<RegistroDTO> registrar(@RequestBody @Valid RegistroDTO registroDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.registrar(registroDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthDTO> login(@RequestBody @Valid LoginDTO authDTO) {
        UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(authDTO.getEmail(), authDTO.getSenha());

        Authentication authentication = authenticationManager.authenticate(userAuth);
        Usuario usuario = (Usuario) authentication.getPrincipal();
        String token = tokenService.gerarToken(usuario);
        return ResponseEntity.ok(new AuthDTO(token, UsuarioMapper.INSTANCE.toDTO(usuario)));
    }

}
