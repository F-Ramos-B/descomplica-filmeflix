package br.com.fran.descomplica.filmeflix.service.base;

import br.com.fran.descomplica.filmeflix.dto.ResponseDTO;
import br.com.fran.descomplica.filmeflix.mapper.base.BaseMapper;
import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import br.com.fran.descomplica.filmeflix.util.ResultUtils;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Fran
 * @param <E> Tipo entidade
 * @param <ID> Tipo do id
 * @param <DTO> Tipo DTO
 * @param <MAPPER> Tipo mapper
 * @param <R> Tipo repository
 */
public abstract class BaseService<E extends BaseEntity<ID>, ID, DTO, MAPPER extends BaseMapper<E, DTO>, R extends JpaRepository<E, ID>> implements ResultUtils {

    protected final R repository;
    protected final MAPPER mapper;

    protected BaseService(R repository, MAPPER mapperInstance) {
        this.repository = repository;
        this.mapper = mapperInstance;
    }

    public DTO buscarPorId(ID id) {
        return mapper.toDTO(requireNotEmpty(repository.findById(id)));
    }

    public List<DTO> listar() {
        return mapper.toDTOList(repository.findAll());
    }

    public ResponseDTO<Void> deletarPorId(ID id) {
        return new ResponseDTO<>(mensagemDelecao(), null);
    }

    protected String mensagemDelecao() {
        return "Recurso deletado com sucesso";
    }

}
