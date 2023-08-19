package br.com.fran.descomplica.filmeflix.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public enum EnumPerfil {

    NOT_FOUND,
    ADMIN,
    USUARIO;

    private static final Map<Integer, EnumPerfil> mapByCodigo = new ConcurrentHashMap<>();
    private static final Map<String, EnumPerfil> mapByDescricao = new ConcurrentHashMap<>();

    static {
        for (EnumPerfil item : values()) {
            String name = item.name();

            if (!StringUtils.equals(name, NOT_FOUND.name())) {
                mapByCodigo.put(item.ordinal(), item);
                mapByDescricao.put(name, item);
            }
        }
    }

    @JsonValue
    public int getCodigo() {
        return ordinal();
    }

    @JsonCreator
    public static EnumPerfil fromCodigo(Integer codigo) {
        return codigo != null ? mapByCodigo.get(codigo) : null;
    }

    public static EnumPerfil fromDescricao(String descricao) {
        return StringUtils.isNotBlank(descricao) ? mapByDescricao.get(descricao) : null;
    }

}
