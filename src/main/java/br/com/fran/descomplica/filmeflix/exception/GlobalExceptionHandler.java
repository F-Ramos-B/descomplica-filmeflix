package br.com.fran.descomplica.filmeflix.exception;

import br.com.fran.descomplica.filmeflix.dto.ErroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErroDTO> tratarException(Exception ex) {
        return gerarErroDTO(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({AccessDeniedException.class, BadCredentialsException.class})
    protected ResponseEntity<ErroDTO> tratarAuthException(Exception ex) {
        return gerarErroDTO(ex, HttpStatus.UNAUTHORIZED);
    }

    private ResponseEntity<ErroDTO> gerarErroDTO(Exception ex, final HttpStatus error) {
        return new ResponseEntity<>(new ErroDTO(ex.getLocalizedMessage(), error.value(), error.getReasonPhrase()), error);
    }

}
