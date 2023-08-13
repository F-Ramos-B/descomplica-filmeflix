package br.com.fran.descomplica.filmeflix.exception;

import br.com.fran.descomplica.filmeflix.dto.ErroDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErroDTO> tratarException(Exception ex) {
        return gerarErroDTO(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({AccessDeniedException.class, BadCredentialsException.class})
    protected ResponseEntity<ErroDTO> tratarAuthException(Exception ex) {
        return gerarErroDTO(ex, HttpStatus.UNAUTHORIZED);
    }
    
    @ExceptionHandler(ResponseStatusException.class)
    protected ResponseEntity<ErroDTO> tratarResponseException(ResponseStatusException rse) {
        return gerarErroDTO(rse, rse.getStatus());
    }

    private ResponseEntity<ErroDTO> gerarErroDTO(Exception ex, final HttpStatus httpError) {
        String detalhesErro = ex.toString();
        log.error(detalhesErro, ex);

        return ResponseEntity.status(httpError).body(
                ErroDTO.builder()
                        .erro(ex.getLocalizedMessage())
                        .statusCode(httpError.value())
                        .descricao(httpError.getReasonPhrase())
                        .detalhes(detalhesErro)
                        .build()
        );
    }

}
