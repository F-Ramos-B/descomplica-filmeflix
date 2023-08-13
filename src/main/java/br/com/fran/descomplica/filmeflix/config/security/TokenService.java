package br.com.fran.descomplica.filmeflix.config.security;

import br.com.fran.descomplica.filmeflix.model.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TokenService {

    @Value("${filmeflix.jwt.issuer:filmeflix}")
    private String JWT_ISSUER;

    @Value("${filmeflix.jwt.secret:8700cf474918d556bf61afb6a3e3855a1e333b14033d07720d7036e14b8bf358}")
    private String JWT_SECRET;

    public String gerarToken(Usuario usuario) {

        try {
            Algorithm algorithm = getCipher();

            return JWT.create()
                    .withIssuer(JWT_ISSUER)
                    .withSubject(usuario.getEmail())
                    .withExpiresAt(gerarDataExpiracao())
                    .sign(algorithm);
        } catch (JWTCreationException jwtce) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Problema ao gerar token", jwtce);
        }

    }

    public String validarToken(String token) {

        try {

            Algorithm algorithm = getCipher();

            return JWT.require(algorithm)
                    .withIssuer(JWT_ISSUER)
                    .build()
                    .verify(token)
                    .getSubject();

        } catch (JWTVerificationException jwtve) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Token invalido", jwtve);
        }

    }

    private static Instant gerarDataExpiracao() {
        return LocalDateTime.now().plusMinutes(60).atZone(ZoneId.systemDefault()).toInstant();
    }

    private Algorithm getCipher() throws IllegalArgumentException {
        return Algorithm.HMAC256(JWT_SECRET);
    }

}
