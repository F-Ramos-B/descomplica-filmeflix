package br.com.fran.descomplica.filmeflix.mapper;

import br.com.fran.descomplica.filmeflix.dto.EstadoDTO;
import br.com.fran.descomplica.filmeflix.model.Estado;
import java.util.List;
import java.util.stream.Collectors;

public abstract class EstadoMapper {

    public static EstadoDTO toDTO(Estado estado) {
        return new EstadoDTO(estado.getId(), estado.getUf(), estado.getNome());
    }

    public static List<EstadoDTO> toDTO(List<Estado> estados) {
        return estados.stream().map(EstadoMapper::toDTO).collect(Collectors.toList());
    }

}
