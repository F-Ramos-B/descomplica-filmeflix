package br.com.fran.descomplica.filmeflix.mapper.base;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface BaseMapper<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntityList(Collection<D> dtos);

    List<D> toDTOList(Collection<E> entities);

    Set<E> toEntitySet(Collection<D> dtos);

    Set<D> toDTOSet(Collection<E> entities);

}
