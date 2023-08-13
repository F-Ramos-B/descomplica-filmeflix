package br.com.fran.descomplica.filmeflix.util;

import java.util.Collection;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ResponseStatusException;

public interface ResultUtils {

    default <T> Collection<T> requireNotEmpty(Collection<T> coll) {
        if (CollectionUtils.isEmpty(coll)) {
            throw notFoundError();
        }

        return coll;
    }

    default <T> T getFirst(Collection<T> coll) {
        return requireNotEmpty(coll).stream().findFirst().orElseThrow(this::notFoundError);
    }

    default <T> T requireNotEmpty(Optional<T> optional) {
        return optional.orElseThrow(this::notFoundError);
    }

    default RuntimeException notFoundError() {
        return new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

}
