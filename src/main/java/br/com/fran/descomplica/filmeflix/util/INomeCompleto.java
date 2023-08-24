package br.com.fran.descomplica.filmeflix.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;

public interface INomeCompleto {
    
    String getNome();
    String getSobrenome();
    
    @JsonProperty("nomeCompleto")
    default String getNomeCompleto() {
        return StringUtils.trimToEmpty(getNome()) + StringUtils.SPACE + StringUtils.trimToEmpty(getSobrenome());
    }
    
}
